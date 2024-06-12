
# Automatización de Pruebas con Java, Maven y TestNG

Este repositorio contiene un proyecto de automatización de pruebas desarrollado en Java utilizando Maven como herramienta de gestión de dependencias y TestNG como framework de pruebas.

## Configuración del Entorno

Antes de ejecutar las pruebas, asegúrate de tener configurado el siguiente entorno:

- **Java Development Kit (JDK)**: Instala JDK en tu sistema. Puedes descargarlo desde [aquí](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).
- **Maven**: Asegúrate de tener Maven instalado. Puedes descargarlo desde [aquí](https://maven.apache.org/download.cgi).
- **IDE**: Utiliza un IDE compatible con Maven, como IntelliJ IDEA o Eclipse, para abrir y trabajar con el proyecto.

## Ejecución de las Pruebas

Para ejecutar las pruebas, sigue estos pasos:

1. Clona este repositorio en tu máquina local:

```bash
git clone https://github.com/Luciana-Calvi/repoAutomation.git
```

2. Abre el proyecto en tu IDE preferido.
   
3. Desde la línea de comandos, navega hasta el directorio raíz del proyecto y ejecuta el siguiente comando para descargar las dependencias del proyecto:

```bash
mvn clean install
```

4. Una vez que se hayan descargado todas las dependencias, ejecuta el siguiente comando para ejecutar las pruebas:

```bash
mvn test
```

## Estructura del Proyecto

El proyecto sigue una estructura de directorios estándar de Maven:

```
|-- src
|   |-- main
|   |   |-- java
|   |   |   |-- (código fuente)
|   |-- test
|   |   |-- java
|   |   |   |-- (pruebas)
|-- pom.xml
```

- **src/main/java**: Contiene el código fuente del proyecto.
- **src/test/java**: Contiene las pruebas automatizadas implementadas utilizando TestNG.
- **pom.xml**: Archivo de configuración de Maven que describe la estructura del proyecto y sus dependencias.

## Contribución

¡Las contribuciones son bienvenidas! Si deseas contribuir a este proyecto, no dudes en enviar un pull request.

## Autor

Este proyecto fue creado por Luciana Calvi. Puedes contactarme en [mi perfil de GitHub](https://github.com/Luciana-Calvi).

## Licencia

Este proyecto está licenciado bajo la Licencia MIT. Consulta el archivo [LICENSE](LICENSE) para obtener más detalles.

