
public static void main(String[] args) {
    Client client = new Client();

    Shape shape1 = client.createShape("redCircle");
    shape1.info();  // Imprime: Círculo rojo

    Shape shape2 = client.createShape("blueSquare");
    shape2.info();  // Imprime: Cuadrado azul
}