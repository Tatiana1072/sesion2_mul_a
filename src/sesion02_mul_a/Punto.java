
package sesion02_mul_a;

public class Punto {
    private float x, y;
    
    
//atributos
//punto se define con el constructor, se genera automaticamente.
//encapsular los hace privados, se accede a traves de metodos
//constructor: construir crear objetos
/*public punto ( ){
}

public punto polar_cartesiano (float radio, float angulo ){ // tipo punto para que devuelva un punto
float x=0; //implementar la formula correcta
float y=0; //implementar la formula correcta
float x= radio * Math.cos(angulo); //dato incompatible, el llamado a la funcion math, devuelve un double y no un foat
float x= radio * (float) Math.cos(angulo);//se ajusta interpreta el dato como flotante
float y= radio * (float) Math.sin(angulo); 
return new punto();*/

    public Punto(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public Punto ( ){
}
    public punto polar_cartesiano (float radio, float angulo ){ // tipo punto para que devuelva un punto
        float x = radio * (float)Math.cos(angulo);
        float y = radio * (float)Math.sin(angulo);
        Cartesiana r=new Cartesiana(x, y); //esta es la otra forma de hacer
        return r;
}
    public Polar cartesiano_polar(float x, float y) { //reciba un carteciano y retorne un polar
        float radio = (float)Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2)); 
        float angulo = (float)Math.tan(y/x);  
        return new Polar(radio, angulo);
    }
    

