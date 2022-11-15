# Mi primera conexión con Maven usando IntelliJ Idea

La intención de este documento es dar el paso a paso para hacer una conexión al servidor Maven y escribir código en el framework Apache Spark usando el IDE **IntelliJ Idea**.

Habiendo hecho las instalaciones necesarias, iniciamos abriendo nuestro IDE IntelliJ, en mi caso tengo la versión 2022.

Al abrirlo encontrarás una ventana similar a la siguiente, puede variar dependiendo de la version que hayas instalado.

![](https://raw.githubusercontent.com/gabrielfernando01/scala/master/Datio/image/plugins.png)

Para este primer proyecto <code>HelloScala</code> solo necesitas tener instalado el plugin de <code>Scala</code>, aunque dependiendo de tus necesidades en un futuro tendrás que instalar otros.

Ahora damos click en Project en seguida a <code>New Proyect</code>:

![](https://raw.githubusercontent.com/gabrielfernando01/scala/master/Datio/image/new_project.png)

Nos abrira una ventana de configuaración, aqui es importante empezar a comentar que es un fichero <code>pompt.xml<code>. De manera simplista podemos decir que es una plantilla que tendrá las configuraciones de nuestro proyecto, y dado que el fichero que se encuentra en esta carpeta trae la la version <code>scala 2.11</code> en el _pompt.xml_ esa es la que tenemos que elegir, aunque si cambias el <code>pompt.xml</code> basta con cambiarlo en la siguiente ventana:

![](https://raw.githubusercontent.com/gabrielfernando01/scala/master/Datio/image/configuration_hello.png)

