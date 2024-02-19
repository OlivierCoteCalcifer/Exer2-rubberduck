Cours 9 prototype Diapo 26
Modele gestionnaire prototype. // gere la cache des canard 3d
Ou builder a la chaine. // Si canard existe pas on call le builder

/*
* Le builder va avoir le directeur.
*/

Consignes

Une usine de canard en caoutchouc essaie d’offrir de nouveaux services avec la popularisation du
Rubber Duck Debugging et la progression des imprimantes 3D. L’entreprise souhaite lancer un site
web pour la création de modèles à télécharger afin d’imprimer nos propres canards 3D à la maison.
Le directeur informatique de l’usine vous engage pour les aider à concevoir l’architecture du système
de gestion des modèles. Vous devez concevoir un projet de base qui respecte les contraintes
données.
Voici les contraintes à respecter :
1- La création d’un modèle 3D a toujours les étapes suivantes dans l’ordre :
a. Création de la tête
b. Création du corps
c. Création des ailes
d. Création de l’habit
2- Considérant la popularité des canards en caoutchouc, on prévoit avoir un nombre important de
modèles. On doit donc pouvoir ajouter de nouveaux modèles sans devoir modifier trop de code
existant.
3- Le directeur vous mentionne que vous devez créer 2 modèles pour tester votre architecture. Il
vous laisse le soin de créer 2 représentations différentes directement dans votre code pour
tester.
4- La classe à utiliser pour représenter et générer le modèle 3D vous est imposée. Vous ne
pouvez pas modifier cette classe. Voir le fichier joint à l’énoncé.
5- Vous pouvez travailler avec le langage de programmation orientée objet de votre choix. Si vous
prenez autre chose que Java, vous devez reproduire la classe Canard tel quel sans en modifier
le comportement.
6- L’initialisation et la génération d’un modèle 3D sont lourdes en ressource. Un système de
cache sera nécessaire.
7- Le système de cache doit être unique et global au système. On ne doit pas pouvoir avoir deux
caches en mémoire.
8- On doit pouvoir demander à la cache de nous retourner un modèle 3D précis. Si le modèle
n’existe pas, on doit le créer et le mettre en cache. La cache doit être vide au départ du
système. Vous pouvez utiliser une chaîne de caractère ou une énumération pour identifier vos
modèles dans la cache.
9- On doit générer le modèle avant de l’ajouter dans la cache.
10- Chaque instance du modèle 3D doit être unique en mémoire. Ce qui signifie que deux modèles
du même type créé à partir de la cache ne doivent pas être la même instance.
11- Vous devez démontrer le fonctionnement de votre architecture par du texte ajouté en console
ou affiché à l’écran. Voir exemple plus bas