# TP Maven-JUnit
N° Etudiant : 22107541
<br> Nom : OUHOCINE
<br> Prénom : SARAH

Pour cet exercice, on veut implémenter une classe immuable Fraction qui représente un nombre rationnel.
Un exemple d’interface pour une telle classe est donné par la classe [`Fraction`](https://commons.apache.org/proper/commons-math/javadocs/api-3.6.1/org/apache/commons/math3/fraction/Fraction.html) de la bibliothèque [Apache Commons Math](https://commons.apache.org/proper/commons-math/).

La classe fournira l’interface suivante :
*   initialisation avec (i) un numérateur et un dénominateur, (ii) juste avec le numérateur (dénominateur égal à 1) ou (iii) sans argument (numérateur égal 0 et dénominateur égal à 1),
*   conversion en chaîne de caractères ([`toString`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Object.html#toString())),
*   les constantes ZERO (0, 1) et UN (1, 1),
*   consultation du numérateur et du dénominateur,
*   consultation de la valeur sous la forme d’un nombre en virgule flottante (double) (`toDouble`),
*   addition de deux fractions (`add`),
*   test d’égalité entre fractions (deux fractions sont égales si elles représentent la même fraction réduite) ([`equals`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Object.html#equals(java.lang.Object)) et [`hashCode`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Object.html#hashCode())),
*   comparaison de fractions selon l’ordre naturel ([`compareTo`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Comparable.html)).

De plus, le projet sera géré avec [Maven](https://maven.apache.org/) et vous utiliserez une approche pilotée par les tests pour la réalisation, i.e. écrivez toujours un test avant le code et pensez au refactoring.
Le framework de tests devra être [JUnit 4](https://junit.org/junit4/) (ou [5](https://junit.org/junit5/) si vous préférez).
Vous rédigerez votre code source en respectant les [conventions de codage](https://google.github.io/styleguide/javaguide.html) proposées par _Google_.
Enfin, la prise en compte des contraintes se fera par de la gestion d’erreurs et des exceptions.


Il pourra éventuellement être nécessaire de [configurer le proxy](http://maven.apache.org/guides/mini/guide-proxies.html) (http://wwwcache.uvsq.fr:3128) pour accéder au dépôt Maven.

À chaque étape, validez vos modifications avec `git` et si nécessaire, exécutez le cycle maven adapté pour vérifier vos manipulations.

1. Quelles conventions utilise Maven pour l’arborescence des répertoires ?

   <br> <div style="text-align: justify;"> Maven est un outil de gestion et d'automatisation de production généralement des projets
   logiciels Java et particulièrement Java EE. Il automatise l'intégration continue lors du
   développement d'un logiciel.
   Le but est de produire à partir de ses sources, un logiciel ; en optimisant les tâches
   réalisées et en garantissant le bon ordre de fabrication.<br/>

   <br/> Maven met en oeuvre le principe de convention over configuration pour utiliser par défaut 
   les mêmes conventions. En effet, l'arborescence d'un projet Maven est par défaut imposée par 
   Maven, contrairement à d'autres outils, tel que Ant ; où l'arborescence de base de chaque projet 
   Maven est toujours la même par défaut.<br/> </div>

   <br/>Maven utilise les conventions suivantes pour l'arborescence des répertoires :  <br/> 
   ><table>
    <thead>
        <tr>
            <th align="center"> <span style="color: green"> Répertoire </span></th>
            <th align="center"> <span style="color: green"> Contenu </span> </th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td> /src </td>
            <td>les sources du projet </td>
        </tr>
        <tr>
            <td> /src/main </td>
            <td>les fichiers sources principaux</td>
        </tr>
        <tr>
            <td> /src/main/java </td>
            <td> le code source </td>
        </tr>
        <tr>
            <td> /src/main/resources </td>
            <td> les fichiers de ressources (fichiers de configuration, images, fichiers annexes ...) </td>
        </tr>
        <tr>
            <td> /src/main/webapp </td>
            <td> les fichiers de la webapp </td>
        </tr>
        <tr>
            <td> /src/test </td>
            <td> les fichiers de tests </td>
        </tr>
        <tr>
            <td> /src/test/java </td>
            <td> le code source de tests </td>
        </tr>
        <tr>
            <td> /src/test/resources </td>
            <td> les fichiers de ressources de tests </td>
        </tr>
        <tr>
            <td> /target </td>
            <td> <div style="text-align: justify;"> les fichiers générés pour les artéfacts et les tests i.e les fichiers résultats, les binaires (du code source et des tests), les packages génériques et les résultats des tests </div> </td>
        </tr>
        <tr>
            <td> /target/classes </td>
            <td> les classes compilées </td>
        </tr>
        <tr>
            <td> /target/test-classes </td>
            <td> les classes compilées des tests unitaires </td>
        </tr>
        <tr>
            <td> /target/site </td>
            <td> site web contenant des informations sur le projet et les rapports générés </td>
        </tr>
        <tr>
            <td> /pom.xml </td>
            <td> le fichier POM contenant la description du projet </td>
        </tr>

    </tbody>
    </table>
    Où se trouvent les sources de l'application et les sources des tests ?
   <table>
    <thead>
        <tr>
            <th align="center"> <span style="color: green"> Sources </span> </th>
            <th align="center"> <span style="color: green"> Emplacement </span> </th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td> les sources de l'application </td>
            <td> /src/main/java </td>
        </tr>
        <tr>
            <td> les sources des tests </td>
            <td> /src/test/java </td>
        </tr>
    </tbody>
   </table>
2. Examinez le projet Maven ainsi que le fichier de description et répondez aux questions suivantes :
    1.  Dans quel répertoire se trouvent les fichiers sources du projet ? Les sources des tests ?
        > Les fichiers sources du projet se trouvent dans le répertoire : <br><span style="color: orange"> /src/main/java/fr.uvsq.cprog.mvnjunit </span> <br>
        <br>Les sources des tests se trouvent dans le répertoire : <br><span style="color: orange"> /src/test/java/fr.uvsq.cprog.mvnjunit </span>
    1. Quelles sont les coordonnées du projet ?
       > Les coordonnées d'un projet (ce qu'on appelle aussi les artéfacts) : est un composant ayant un identifiant unique composé de trois éléments : un groupId, un artifactId et un numéro de version. <br>
       <br> En examinant le fichier pom.xml, les coordonnées caractérisant notre projet sont : <br>
       <code>
       &lt;groupId&gt;<span style="color: orange">fr.uvsq.cprog</span>&lt;/groupId&gt; <br>
       &lt;artifactId&gt;<span style="color: orange">mvnjunit</span>&lt;/artifactId&gt; <br>
       &lt;version&gt;<span style="color: orange">1.0-SNAPSHOT</span>&lt;/version&gt;
       </code>
       <br> <h4> <span style="color: orange"> 1) fr.uvsq.cprog : </span> </h4> Spécifiée dans la balise groupId permettant ainsi, d'identifier le groupe qui a créé le projet. le groupId permet d'organiser et de retrouver notre projet plus facilement et rapidement.
       <br> <h4> 2) <span style="color: orange"> mvnjunit :</span></h4> Spécifiée dans la balise artifactId permettant d'indiquer un nom unique utilisé pour nommer les artifacts à construire.
       <br> <h4> 3) <span style="color: orange"> 1.0-SNAPSHOT : </span> </h4> Spécifiée dans la balise version, indiquant l'artifact généré par le projet.
    1. À quoi sert la propriété `project.build.sourceEncoding` ?
        > La propriété `project.build.sourceEncoding` sert à spécifier <span style="color: orange"> le type d'encodage des caractères </span> du code source (dans le cas de notre projet, le codage défini est : UTF-8). 
    1. Quelles versions des sources et de la JVM sont utilisés ?
       > La version des sources utilisée est : <span style="color: orange"> 1.7 </span>
       <br>La version de la JVM utilisée est : <span style="color: orange"> 17 </span>
    1. Quelle version de JUnit est configurée ? À quoi sert la balise `scope` ?
       > La version de JUnit configurée est : <span style="color: orange"> 4.11 </span>
       <br><div style="text-align: justify;"> L'interet de la balise `scope` : En effet, Maven définit 5 portées pour les dépendances (compile, provided, runtime, test et system), ainsi, ces dépendances ne doivent pas forcément être utilisées de la même manière dans le processus de build ou lors de l'exécution de l'artéfact.
       <br> Pour cela, Maven utilise la balise `scope` pour préciser comment la dépendance sera utilisée.
       <br><br> Pour notre projet, on précise que la dépendance <span style="color: orange"> <groupId>junit</groupId> / <artifactId>junit</artifactId> / <version>4.11</version> </span> sera utilisée lors de l'exécution des <span style="color: orange">tests</span>. </div>
    1. À quoi sert la section `pluginManagement` ?
       > <div style="text-align: justify;"> La section `pluginManagement` sert à partager la même configuration de plugin entre tous les modules du projet. <br>En effet, ce `pluginManagement` définit les paramètres des plugins qui seront hérités par les modules du build. Ce qui est idéal quand on a un fichier pom parent. </div>
3. Modifiez la configuration du projet de la façon suivante :
    1.  fixez la version des sources et des .class pour utiliser la version 11 de Java
    1.  utilisez la dernière version stable de JUnit 4 (cf. [MVNRepository](https://mvnrepository.com/))
4. Ajoutez un fichier `.gitignore` adapté aux projets Maven (cf. [A collection of .gitignore templates](https://github.com/github/gitignore)) et ajoutez-y les fichiers et répertoires de votre IDE.
5. Quelle commande Maven permet de :
    1.  créer un `jar` du projet ?
        > Exécuter la commande : `mvn clean package`
    1. lancer les tests ?
        > Exécuter la commande : `mvn test`
    1. supprimer tous les fichiers issus de la compilation ?
        > Exécuter la commande : `mvn clean`
6. Ajoutez une classe `Fraction` et une classe `FractionTest` dans les répertoires et packages appropriés.
    Supprimez les classes d'exemple `App` et `AppTest`.
7. Énumérez une liste de cas de tests à réaliser en n'oubliant pas les cas d'erreur.
        > <table>
        <thead>
        <tr>
            <th align="center">Constructeur / Méthode</th>
            <th align="center">Cas de tests</th> 
        </tr>
        </thead>
        <tbody>
        <tr>
            <td align="center"> <span style="color: red"> Cas d'erreur </span></td>
            <td> <div style="text-align: justify;">  
                   1) Dénominateur d'une fraction est nul ex. 1/0 --> exception
                   <br> 2) Dénominateur d'une fraction est négatif --> dans ce cas, au lieu de lever une exception, je récupère la fraction et je multiplie le numérateur et le dénominateur par -1 afin que le dénominateur soit positif ex1. 1/-2= -1/2, ex2. -1/-2=1/2 
                  </div>
            </td>
        </tr>
        <tr>
            <td align="center"> Fraction(numérateur,dénominateur) </td>
            <td> <div style="text-align: justify;"> <span style="color: grey"> Constructeur à 2 arguments : </span>
                   <br> 1) construction de deux fractions positives identiques,  <span style="color: green"> ex. 1/2 et 1/2 </span>, puis vérifier si elles sont égales pour s'assurer  que le constructeur a bien fonctionné.
                   <br> 2) construction de deux fractions négatives identiques, <span style="color: green"> ex. -1/2 et -1/2 </span>, puis vérifier si elles sont égales pour s'assurer  que le constructeur a bien fonctionné. </div>
            </td>
        </tr>
        <tr>
            <td align="center"> Fraction(numérateur) </td>
            <td> <div style="text-align: justify;"> <span style="color: grey"> Constructeur à 1 seul argument : </span> 
                   <br> construction d'une fraction avec le deuxième constructeur qui prend un seul argument : le numérateur <span style="color: green"> ex. 2/1 </span>, puis vérifier si elle est égale à la fraction <span style="color: green"> 2/1 </span> (construite avec le premier constructeur qui prend deux arguments : le numérateur et le dénominateur), pour s'assurer  que le constructeur a bien fonctionné. </div>
            </td>
        </tr>       
        <tr>
            <td align="center"> Fraction() </td>
            <td> <div style="text-align: justify;"> <span style="color: grey"> Constructeur à 0 arguments : </span> 
                   <br> 1) construction d'une fraction avec le troisième constructeur qui prend pas d'arguments, puis vérifier si elle est égale à la fraction  <span style="color: green">  0/1 </span> (construite avec le premier constructeur qui prend deux arguments : le numérateur et le dénominateur), pour s'assurer  que le constructeur a bien fonctionné. 
                   <br> 2) construction d'une fraction avec le troisième constructeur qui prend pas d'arguments, puis vérifier si elle est égale à la fraction  <span style="color: green">  0/1 </span> (construite avec le deuxième constructeur qui prend un seul argument : le numérateur), pour s'assurer encore une fois que le constructeur fonctionne. </div>
            </td>
        </tr>
        <tr>
            <td align="center"> toString() </td>
            <td> <div style="text-align: justify;"> Tester si l'ffichage d'une fraction lorsque on fait appel à la fonction toString est égale à l'affichage attendu : <span style="color: green"> numérateur/dénominateur</span> </div>
        </td>
        </tr>
        <tr>
            <td align="center"> toDouble() </td>
            <td> <div style="text-align: justify;"> Tester si le résultat retourné par la fonction ToDouble (qui transforme une fraction positive ou négative en un nombre à virgule flottante) est égale au : nombre à virgule flottante attendu, <span style="color: green"> ex. tester 1/2=0.5 </span> dans le test de toDouble  </div></td>
        </tr>
        <tr>
            <td align="center"> pgcd(numérateur,dénominateur) </td>
            <td> <div style="text-align: justify;"> <span style="color: orange"> PS : Fonction utilisée pour réduire une fraction </span>
            <br><br> Tester l'égalité entre la valeur du pgcd entre le numérateur et le dénominateur de la fraction attendue et la valeur du pgcd de la fraction résultante retourné par la fonction pgcd,
                 <br> 1) numérateur non premier avec le dénominateur, <span style="color: green"> ex1. pgcd 10/20 --> tester l'égalité 10=10 </span> dans le test du pgcd 
                 <br> 2) numérateur premier avec le dénominateur, <span style="color: green"> ex2. pgcd 2/3 --> tester l'égalité 1=1 </span> dans le test du pgcd 
                 <br> 3) cas spéciaux, <span style="color: green"> ex3. pgcd 0/0 et 1/0 --> tester l'égalité 1=1</span> dans le test du pgcd </div>
            </td>
        </tr> 
        <tr>
            <td align="center"> add(fraction) </td>
            <td> <div style="text-align: justify;"> <span style="color: orange"> PS : Les dénominateurs sont unifiés avant de faire l'addition et les fractions résultantes sont réduites </span> 
                 <br><br> Tester l'égalité entre la fraction attendue et la fraction résultante retournée par la fonction add, <span style="color: green"> ex1. 1/2 + 1/2 = 1/1 = UN, ex2. 1/2 + -1/2 = 0/1 = ZERO, ex3. -1/2 + -1/2 = -1/1, ex4. ZERO+UN=UN, ex5. ZERO+ZERO=ZERO, ex6. UN+UN=2/1, ex7. 2/3+3/2=13/6  </span> </div>
            </td>
        </tr>
       <tr>
            <td align="center"> hashCode(fraction) </td>
            <td> <div style="text-align: justify;"> PS : Les dénominateurs sont unifiés et les fractions résultantes sont réduites avant de leur attribuer un hashcode 
                   <br><br> 1) Tester l'égalité entre les hashcodes de deux fractions identiques ex. 1/2 et 1/2
                   <br> 2) Tester l'égalité entre les hashcodes de deux fractions égales ex1. 1/2 et 2/4, ex2. 1/2 et -1/-2
                   <br> 3) Tester l'égalité entre les hashcodes d'une fraction et d'une constante ex1. 0/1 et ZERO, ex2. 1/1 et UN </div>
                   4) Tester la non égalité entre les hashcodes deux fractions différentes ex1. 1/2 et 2/3, ex2. 1/2 et -1/2
            </td>
        </tr> 
        <tr>
            <td align="center"> equals(fraction) </td>
            <td> <div style="text-align: justify;"> <span style="color: orange"> PS1 : Les dénominateurs sont unifiés et les fractions résultantes sont réduites avant de faire les tests d'égalité </span>
                 <br> PS2 : Utilisation du hashCode 
                 <br><br> 1) Tester l'égalité entre deux fractions positives identiques, <span style="color: green"> ex. 1/2 = 1/2 </span>
                 <br> 2) Tester l'égalité entre deux fractions négatives identiques, <span style="color: green"> ex. -1/2 = -1/2 </span>   
                  3) Tester l'égalité entre deux fractions positives ou négatives non identiques, <span style="color: green"> ex1. 2/2 = 3/3, ex2. -2/-2 = -3/-3, ex3. -2/2 = -3/3 </span>
                 <br> 4) Tester l'égalité entre deux fractions négatives tels que f1 = -numérateur/dénominateur  et f2 = numérateur/-dénominateur ou vice-versa, <span style="color: green"> ex1. -1/2 = 1/-2, ex2. 1/-2 = -1/2 </span>  
                  5) Tester l'égalité entre deux fractions positives tels que f1 = numérateur/dénominateur  et f2 = -numérateur/-dénominateur, <span style="color: green"> ex. 1/2 = -1/-2 </span>
                 <br> 6) Tester l'égalité entre une fraction positive (numérateur et dénominateur > 0) et une fraction constante, <span style="color: green"> ex1. 1/1 = UN, ex2. 2/2 = UN, ex3. 0/1 = ZERO, ex4. 0/2 = ZERO </span>
                 <br> 7) Tester l'égalité entre une fraction positive (numérateur et dénominateur < 0) et une fraction constante, <span style="color: green"> ex1. -1/-1 = UN, ex2. -2/-2 = UN </span>
                 <br> 8) Tester la non égalité entre une fraction positive et une fraction négative, <span style="color: green"> ex1. 1/2 =! -1/2, ex2. -1/-2 =! -1/2 </span> 
                 <br> 9) Tester la non égalité entre une fraction et une fraction inverse, <span style="color: green"> ex1. 1/2 =! 2/1, ex2. -1/-2 =! -2/-1 </span> </div>
            </td>
        </tr>
        <tr>
            <td align="center"> compareTo(fraction) </td> 
            <td> <div style="text-align: justify;"> <span style="color: orange"> PS1 : Les dénominateurs sont unifiés et les fractions résultantes sont réduites avant de faire les tests de comparaison </span>
            <br> PS2 : Utilisation du hashCode 
            <br><br> Tester l'égalité entre le résultat devant etre retourné par la fonction compareTo (résultat attendu) et le résultat retourné par la fonction compareTo   
            <br> 1) dans le cas d'inferiorité (fraction 1 < fraction 2) --> pour les fractions <span style="color: green"> ex1. 1/2 < 2/1, ex2. -2/1 < 1/2, ex3. -2/1 < -1/2 ---> Test d'égalité -1=-1 </span>
            <br> 2) dans le cas de supériorité (fraction 1 > fraction 2) --> pour les fractions <span style="color: green"> ex1. 2/1 > 1/2 , ex2. 1/2 > -2/1, ex3. -1/2 > -2/1 ---> Test d'égalité 1=1 </span>
            <br> 3) dans le cas d'égalité (fraction 1 = fraction 2) --> pour les fractions <span style="color: green"> ex1. 2/2 = 2/2, ex2. 2/2 = -1/-1   ---> Test d'égalité 0=0 </span> </div>
            </td>
        </tr>
        </tbody>
        </table>
8. Pour chaque cas de test,
    1. écrivez le test JUnit correspondant dans la classe de test,
    1. vérifiez qu’il échoue,
    1. implémentez la fonctionnalité dans la classe,
    1. vérifiez que le test passe,
    1. appliquez un étape de refactoring sur les tests et la classe si nécessaire.
9. Modifiez le POM pour intégrer la vérification des conventions de codage avec [`checkstyle`](http://maven.apache.org/plugins/maven-checkstyle-plugin/) en utilisant les conventions _Google_.
      >  1> Ajouter le plugin  `maven-checkstyle-plugin` au fichier pom.xml
       <br> 2> Exécuter la commande maven `mvn checkstyle:check`
10. Ajoutez une méthode `main` qui démontre quelques fonctionnalités de la classe, puis modifiez le POM pour que le jar généré soit exécutable (cf. [Apache Maven JAR Plugin](https://maven.apache.org/plugins/maven-jar-plugin/index.html))
11. Modifiez la méthode `main` pour que les différents affichages se fassent à l'aide de la bibliothèque de logging [`SLF4J`](http://www.slf4j.org/)
      >  1> Ajouter les deux dépendances `slf4j-api` et `slf4j-simple` au fichier pom.xml
       <br> 2> Réimplémenter la méthode `main`  pour que les différents affichages se fassent à l'aide de la bibliothèque de logging `slf4j` 
12. En utilisant le plugin [assembly](https://maven.apache.org/plugins/maven-assembly-plugin/) (ou le plugin [shade](https://maven.apache.org/plugins/maven-shade-plugin/)), générez une archive du projet contenant ses dépendances (uber-jar)
      >  1> Ajouter les deux plugin `maven-assembly-plugin` et `maven-jar-plugin` au fichier pom.xml
       <br> 2> Exécuter la commande maven `mvn clean compile assembly:single` 
       <br><br> PS: Le jar avec dépendences s'est généré dans le target.