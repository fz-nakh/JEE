# JEE

<img src="https://user-images.githubusercontent.com/74434162/166102713-25d235fd-5026-4097-966b-ffd41c06111a.png"  align="center" />



	                                                   Rapport de projet de jee 

                                               Thème : Application web JEE Gestion des patients
                                                           

                                                                Réalisé par :
                                                          NAKHLAT  Fatima-Ezzahra 


                                                                Encadré par :
                                                              Mohamed Youssfi


                                            


                                                      Année universitaire 2021-2022
						      


<h1>I.	Présentation du sujet : </h1>
Le sujet consiste à développer une application pour présenter, rechercher ,ajouter supprimer des patients ainsi que la partie admin en toute sécurité. L'objectif de ce projet est de concevoir et développer un une application web qui doit permettre l’inscription des patients pour devenir clients afin d’être nos patients.
<h2>1.	Solution proposée</h2>
 Nous proposons d’informatiser l’application par la création d’une page d’accueil. Il nous est indispensable de préciser à cette étape que notre projet prendra en considération toutes ces contraintes en essayant de présenter les solutions nécessaires tout en respectant les règles des jeux d’une application web tels que la simplicité de navigation entre les pages, la bonne ergonomie et la sécurité des données confidentielles des patients.

<h2>2.	Etude des besoins </h2>
Dans cette section du chapitre, nous nous intéressons aux besoins des utilisateurs traités dans notre projet c’est à dire l’inscription du patient, l’authentificatin,l’ajout,suppression, à travers les spécifications fonctionnelles et non fonctionnelles pour aboutir à une application de qualité qui répond aux besoins des patients. 
<h3>A.	Besoins fonctionnels</h3>

 <h4>Les besoins fonctionnels se présentent en Quatre grandes parties</h4> 
 	Partie 1 : Rechercher les patients, pagination et suppression des patients
 	Partie 2 : Page Template, Ajout des patients, validation des formulaires, édition et mise à jour des patients
 	Partie 3 : Spring Security (Stratégies : InMemoryAuthentication et JDBCAuthentication)
 	Partie 4 : Spring Security (Stratégie : UserDetailsService)
<h2>3.	Besoins non fonctionnels :</h2>

Les besoins non fonctionnels sont importants car ils agissent de façon indirecte sur le résultat et sur le rendement de l’utilisateur, ce qui fait qu’ils ne doivent pas être négligés, pour cela il faut répondre aux exigences suivantes : 

<h3>A.	Fiabilité :</h3> 
L’application doit fonctionner de façon cohérente sans erreurs et doit être satisfaisante. 
<h3>A.	Les erreurs :</h3>
Les ambigüités doivent être signalées par des messages d’erreurs bien organisés pour bien guider l’utilisateur et le familiariser avec notre application. 
<h3>B.	Ergonomie et bonne Interface : </h3>
L’application doit être adapté à l’utilisateur sans qu’il ne fournisse aucun effort (utilisation claire et facile) de point de vue navigation entre les différentes pages, couleurs et mise en textes utilisés.
<h3>C.	Sécurité :</h3> 
Notre solution doit respecter surtout la confidentialité des données personnelles des clients qui reste l’une des contraintes les plus importantes dans les applications. 
<h3>D.	Aptitude à la maintenance et la réutilisation : </h3>

Le système doit être conforme à une architecture standard et claire permettant sa maintenance et sa réutilisation. 

<h3>E.	Compatibilité et portabilité : </h3>

Une application quel que soit son domaine, son éditeur et son langage de programmation ne peut être fiable qu’avec une compatibilité avec tous les navigateurs web et tous les moyens que ce soit PC, IPAD ou Mobiles. 


Conclusion 
Dans ce chapitre on a présenté une étude du système existant, les lacunes qu’il comprend ainsi que les solutions que nous proposons pour pallier ces problèmes.



II.	Réalisation de l’application   
1.	Vue d’ensemble de l’application :
 Dans cette partie, nous allons vous présenter les différentes étapes qu’on a suivi pour pouvoir réaliser ce projet, commençant de la partie l’exécution jusqu’à et l’affichage des résultats.


	Création du projet :

Pour créer notre projet, on va choisir le langage JEE




<h1>Authentifiation</h1>
<h4 color=blue> Correct </h4>

![image](https://user-images.githubusercontent.com/74434162/166125632-96321dea-154a-4c20-81e5-06cc0d616a00.png)
<h4 color=red> InCorrect </h4>
![image](https://user-images.githubusercontent.com/74434162/166126713-9094bb80-2cc2-4d3d-a799-596bf683f069.png)
<h1>Partie Admin</h1>
![image](https://user-images.githubusercontent.com/74434162/166126543-58e91d54-1458-449b-8873-df76c394d07b.png)
<h1>Ajouter Patient</h1>
![image](https://user-images.githubusercontent.com/74434162/166126549-c006f874-44b2-4f1c-a7c9-d841ace3c7df.png)

<h1>Modifier un patient</h1>
![image](https://user-images.githubusercontent.com/74434162/166126558-38453add-ca1a-4ca7-bd06-8e420447121b.png)
<h1>Chercher Un Patient</h1>
![image](https://user-images.githubusercontent.com/74434162/166126565-1a663e12-105d-4ec2-b481-f784354bd811.png)
<h1>Partie Utlisateur</h1>
<h3>Page d'accueil</h3>
![image](https://user-images.githubusercontent.com/74434162/166126583-ff10bd7b-ffdb-42e7-9da4-65821ad075ad.png)
<h3>Rechercher</h3>
![image](https://user-images.githubusercontent.com/74434162/166126588-bf360592-f4fc-4b28-b03e-eb82678e0df8.png)

<h1>2.	Langage et logiciel</h1>

<h2>A.	Langages</h2>

	JEE

JEE (Java Entreprise Edition) est la version entreprise de la plate-forme "Java" qui se compose de l'environnement "JSE" ainsi que de nombreuses API et composants destinés à une utilisation "côté serveur" au sein du système d'information de l'entreprise. Il s'agit donc d'une évolution du Java.

![image](https://user-images.githubusercontent.com/74434162/166126336-65852bc7-f846-4fe6-9291-ff66210b55a3.png)


	HTML
Le HyperText Markup Language, généralement abrégé HTML ou dans sa dernière version HTML5, est le langage de balisage conçu pour représenter les pages web.

![image](https://user-images.githubusercontent.com/74434162/166126400-7e2f30f3-ca2d-4aab-8807-18007838bfc0.png)

<h2>B.	Logiciels :</h2>

	 IntelliJ

IntelliJ IDEA également appelé « IntelliJ », « IDEA » ou « IDJ » est un environnement de développement intégré destiné au développement de logiciels informatiques reposant sur la technologie Java
![image](https://user-images.githubusercontent.com/74434162/166126602-da605288-bdf3-4009-9ade-5ee798b34f47.png)


  
	XAMPP

XAMPP est un ensemble de logiciels permettant de mettre en place un serveur Web local, un serveur FTP et un serveur de messagerie électronique.Il s'agit d'une distribution de logiciels libres (X (cross) Apache MariaDB Perl PHP) offrant une bonne souplesse d'utilisation
![image](https://user-images.githubusercontent.com/74434162/166126432-4da1a641-dc18-4d97-a81e-4346e025335e.png)








