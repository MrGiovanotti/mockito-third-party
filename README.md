# mockito-third-party
Ejemplo de WS en Spring boot 2.5.2, utilizando BDD en memoria, entities, repositories, DTOs.

Ejemplo de WS, utilizando todas las buenas prácticas que recomienda Sonarlint. Se utiliza Spring boot 2.5.2, BDD en memoria H2.

Para la inserción de datos en la BDD H2 se utiliza un archivo import.sql, ubicado en los resources de la aplicación.

Este ejemplo de WS puede utilizarse como dummy si se necesita consumir un WS REST desde otra aplicación, por ejemplo,
yo lo usaré para consumir desde otra aplicación, en la cual haré un ejemplo de pruebas unitarias del consumo de un WS
utilizando Mockito, de allí el nombre de este proyecto :)

Este WS utiliza dos entities (Person y Neighborhood) relacionadas Many-to-one, y consiste en la entrega de datos de una persona, buscando por id o
por número de identificación. Estos datos consisten en datos de la persona y barrio en donde vive.
