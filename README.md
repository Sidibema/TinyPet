## Projet TinyPet

Dans le cadre du module développement d'applications sur le Cloud, il nous a été demandé de réaliser une application web pour la gestion des pétitions.

Dans ce readme nous allons détailler les différentes fonctionnalités réalisées ainsi que quelques aperçus de notre application. 

Ce projet a été réalisé par SIDIBE MARIAM ET NAJEM ALAA.


## Les liens
Lien vers l'application :https://projetcloudfinal-417911.ew.r.appspot.com/#!/


# DataStore:
<img width="1437" src="/ds1.png">

<img width="1437" src="/ds2.png">

## Fonctionnalités réalisées

Voici des fonctionnalités qu’on a réalisées :

<li>Ajouter/Modifier/Supprimer une pétition</li>  

Nous avons développé un formulaire comprenant six champs pour faciliter la création d'une pétition : deux champs obligatoires pour le titre et la description, et quatre champs facultatifs pour le thème, les tags, une URL pour une image, et un objectif de signatures à atteindre.

<li>Ajouter un objectif pour un nombre de signature</li>

Permettre à l'utilisateur de définir l'objectif en termes de nombre de signatures nécessaires pour que sa pétition atteigne son but final.

<li>Afficher les détails d’une pétition</li>

Nous avons intégré des boutons "Voir la pétition" pour permettre la consultation des détails de chaque pétition. Ces détails incluent les champs renseignés lors de sa création, ainsi que des informations telles que l'auteur de la pétition, la date de création et la date de la dernière modification.

<li>Signer une pétition/Enlever une signature</li>

Nous avons implémenté un bouton "Signer la pétition" pour chaque signature, qui augmente le nombre de signataires à chaque nouvelle signature. Si l'utilisateur est le créateur de la pétition, un message s'affiche pour l'informer qu'il ne peut pas signer sa propre pétition. De plus, si l'utilisateur tente de signer une pétition plusieurs fois, un message d'erreur lui sera également affiché.

<li>Lister mes pétitions créées et signées</li>

Chaque utilisateur peut accéder à une liste des pétitions qu'il a créées ou signées. Il a également la possibilité de consulter les détails de chaque pétition et de les modifier ou de les supprimer selon ses besoins.

<li>Lister les pétitions les plus récentes/signées</li>

Dans la section "Parcourir les pétitions", les pétitions affichées peuvent être triées par date de création en sélectionnant "Les pétitions récentes". De même, les pétitions signées peuvent être triées par nombre de signatures dans l'ordre décroissant en choisissant la sous-catégorie "Top pétitions signées".

<li>Rechercher les pétitions en fonction du titre ou tag</li>

En utilisant l'icône de recherche, il est possible d'effectuer une recherche de pétition en fonction du titre ou du tag. Pour une recherche par titre, les mots-clés peuvent être saisis, et les pétitions contenant ces mots-clés dans leur titre seront affichées. Pour une recherche par tag, il suffit de saisir l'un des tags de la pétition souhaitée, et toutes les pétitions associées à ce tag seront affichées.
<br/>

## Aperçu de l’application
</br>
<li>Page d'accueil / Les pétitions récentes / Les pétitions plus signées</li></br>
<img width="1437"  src="/pagewebpet.png">

## Conclusion

Ce projet a été une expérience très enrichissante, nous permettant d'acquérir des connaissances tout au long de sa réalisation et de mettre en pratique ce que nous avons appris lors du module de développement d'applications sur le cloud, à travers un cas d'utilisation réel.

Sur le plan de la gestion d'équipe, la création de TinyPet nous a encouragés à nous entraider et à partager nos connaissances, tout en nous apprenant à nous organiser et à répartir les tâches de manière efficace, tout en respectant les délais.

Pour développer l'interface de notre application web, nous avons opté pour l'utilisation de Mithril.js, un framework JavaScript réactif. Ce choix nous a donné l'occasion de découvrir les avantages de Mithril.js dans la conception d'applications monopage, offrant ainsi une solution plus efficace pour améliorer les performances.
