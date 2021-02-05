# INTRODUCTION TO COMPLEX SYSTEMS, JAVA, MVN, AND GIT

Este proyecto busca implementar la media y la desviación estándar haciendo uso de LinkedList, en particular esta debe ser creada por nosotros, y debe ser compatible con la interface List, además, hacemos uso del micro-framework Spark y de la herramienta heroku para poder desplegar nuestra pagina web. Para ello hacemos uso de estructura de datos para manejar los nodos correctamente y poder implementar la lista. [Aquí](Design.pdf) puede encontrar el informe con mayor detalle. 

## Comenzando 🚀

_Estas instrucciones te permitirán obtener una copia del proyecto en funcionamiento en tu máquina local para propósitos de desarrollo y pruebas._

### Pre-requisitos 📋

Para poder hacer uso de este proyecto se debe tener instalado:
 
  * MVN
  * Git
  * Java
  * HerokuCli (En caso de querer desplegar el proyecto localmente)

### Instalación 🔧

Lo primero que debe hacer es descargar el proyecto, lo pude hacer directamente descargando el .zip, o puede clonar el archivo con el siguiente comando.

```
git clone https://github.com/sebastianNietoMolina/AREP-lab2.git
```

Entramos al directorio del proyecto con el comando

```
cd AREP-lab2
```

Luego debe ingresar el siguiente comando para que se ejectue hasta la fase de empaquetamiento, debe asegurar que antes de ingresar este comando, que exista en la carpeta que esta un archivo llamado pom.xml

```
mvn package
```

Tambien me gustaria aclarar que puedes descargar el javaDoc, este quedara guardado en una carpeta target, esta se genera una vez echo el comando anterior, y con el siguiente comando se creara la carpeta site, la ruta sera target/site.

```
mvn javadoc:javadoc
```

## Ejecutando las pruebas ⚙️

El anterior comando mvn package ya ejecuta las pruebas, pero si desea verlas por aparte puede ejecutar el siguiente comando.

```
mvn test.
```

### Analice las pruebas end-to-end 🔩

Se puede evidenciar cuando pasan las pruebas, no se deben ejecutar varias al mismo tiempo, puede ocasionar que no pase, pero de forma secuencial lo lograra.

![](https://github.com/sebastianNietoMolina/AREP-lab1/blob/main/fotos-documentos/pruebas.PNG)

## Autores ✒️

_Menciona a todos aquellos que ayudaron a levantar el proyecto desde sus inicios_

* **Sebastian Nieto** - [sebastianNieto](https://github.com/sebastianNietoMolina)

## Licencia 📄

Este proyecto está bajo la Licencia MIT - mira el archivo [LICENSE.md](LICENSE.md) para detalles

## Expresiones de Gratitud 🎁

Reconocimientos a: [Villanuevand](https://github.com/Villanuevand), use su plantilla de README.md.
