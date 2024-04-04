package foo;

import java.io.IOException;
import java.util.Date;
import java.util.HashSet;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;

@WebServlet(name = "PetServlet", urlPatterns = { "/petition" })
public class PetitionServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        // Set security headers
       // response.setHeader("Cross-Origin-Opener-Policy", "same-origin-allow-popups");
       // response.setHeader("Cross-Origin-Embedder-Policy", "require-corp");

        response.setHeader("Access-Control-Allow-Origin", "https://projetcloudfinal-417911.ew.r.appspot.com");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "Content-Type, Accept, X-Requested-With, remember-me");


        Random r = new Random();
        DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();

        // Create petition
        for (int i = 0; i < 500; i++) {
            Entity e = new Entity("Petition", "P" + i);
            int owner = r.nextInt(1000);
            e.setProperty("Owner", "U" + owner);
            e.setProperty("Date", new Date());
            e.setProperty("Body", "bla bla");

            // Create random votants
            HashSet<String> fset = new HashSet<String>();
            for (int j = 0; j < 200; j++) {
                fset.add("U" + r.nextInt(1000));
            }
            e.setProperty("Votants", fset);
            e.setProperty("nbVotants", fset.size());

            // Create random tags
            HashSet<String> ftags = new HashSet<String>();
            while (ftags.size() < 10) {
                ftags.add("T" + r.nextInt(1000));
            }
            e.setProperty("tags", ftags);

            datastore.put(e);
            response.getWriter().print("<li> created post: " + e.getKey() + "<br>");
        }
    }
}
