# # Practica Mentoría 
Se presenta la solución a la práctica propuesta en la mentoría del 27 de abril del 2022.

En la imagen se observa el proyecto con estructurado con las dos entidades con sus respectivos servicios, controles y repositorios totalmente funcional. 

![image](https://user-images.githubusercontent.com/103125129/165660620-58df1808-bb42-4174-8a67-0e516f99ce43.png)


A continuación mostraremos los diferentes peticiones realizadas para la entidad usuario y a rol.


1. Actualizar: 


primero observamos una lista de varios usarios creados. 

![image](https://user-images.githubusercontent.com/103125129/165660880-1dfcba83-d8b8-4a16-95c2-e999ef97c4e7.png)


En la siguiente imagen se observa como el metodo actualizar funciona correctamente, pasando de tener un usuario como sandy a llamarse sandy camila salas yanes. 

![image](https://user-images.githubusercontent.com/103125129/165661075-bb6b1c29-e3e0-4084-b6c8-bb9925fd0918.png)


Los demas metodos ya fueron comprobados en la clase a continuacion vamos a ver los metodos para agregar usuarioRol 

1. crear: se observa como se crea corectamente el rol y se le asigna al usuario con el cual tiene una llave asociada idUsuario, lo cual le otorga un rol a sandy camila como ingeniera biomedica. 

 ![image](https://user-images.githubusercontent.com/103125129/165661238-4001669b-f807-4778-b94e-f2242e5a7259.png)

![image](https://user-images.githubusercontent.com/103125129/165662284-0f39d48e-3c70-4b6a-bd81-0cce54793042.png)

2. Obtener todos:

![image](https://user-images.githubusercontent.com/103125129/165661544-05eb6403-31a6-4e0d-b2e6-4bdedfb02fad.png)

 
3. Obtener id:
 ![image](https://user-images.githubusercontent.com/103125129/165661697-b2b4d230-d9f5-475d-92ef-72e936066f1f.png)

4. Eliminar:
![image](https://user-images.githubusercontent.com/103125129/165661884-c8b0d331-70de-4d65-930d-50ec4df4355a.png)
 
5. actualizar:
![image](https://user-images.githubusercontent.com/103125129/165662556-ea8087a8-748d-497b-b1c0-485314128e3a.png)

RELACIONES ENTRE ENTIDADES 

![image](https://user-images.githubusercontent.com/103125129/165662916-c3275522-54d7-4d1f-b87a-9e0816b25ab0.png)

Se agrega esta relacion de uno a mucho ya que como lo dice el enunciando un usuario puede constar con mas de un rol. 

se utilizo la relacion @OneToMany de manera unidirecional @JsonBackReference mostrando una relacion padre hijo. de igual forma se utilizo la anotacion @JoinColumn para hacer referencia a la tabla en la base de dato. en nuestro caso se usa en la entidad usuario ya que esta seria como la entidad padre. 

para el caso del la entidad usuarioRol utilizamos @ManyToOne ya que muchos rol pueden estar contenidos en un usuario


