package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    //Actividad 3
    //Cuadrado:
    // Perimetro: lado x 4
    // Area: lado x lado
    public static float perimetroCuadrado(float lado) {
        try {
            if (lado <= 0) {
                throw new IllegalArgumentException("El lado no puede ser menor o igual a 0");
            } else {
                //la multiplicacion por diez y la division por diez es para redondear a un decimal
                lado = Math.round(lado * 10);
                System.out.println((lado * 4)/10);
                return (lado * 4)/10;
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }

    public static float areaCuadrado(float lado) {
        try{
        if (lado <= 0) {
            throw new IllegalArgumentException("El lado no puede ser menor o igual a 0");
        } else {
            System.out.println(lado*lado);
            return lado * lado;
        }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }

    //Rectángulo:
    // Perimetro: (base x 2) + (altura x 2)
    // Area: base x altura
    public static float perimetroRectangulo(float base, float altura) {
        try {
            if (base <= 0 || altura <= 0) {
                throw new IllegalArgumentException("La base y la altura no pueden ser menores o iguales a 0");
            } else {
                return (base * 2) + (altura * 2);
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }

    public static float areaRectangulo(float base, float altura) {
        try {
            if (base <= 0 || altura <= 0) {
                throw new IllegalArgumentException("La base y la altura no pueden ser menores o iguales a 0");
            } else {
                return base * altura;
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }

    //Círculo:
    // Perimetro: 2 x pi x radio
    // Area: pi x radio x radio
    public static double perimetroCirculo(float radio) {
        try {
            if (radio <= 0) {
                throw new IllegalArgumentException("El radio no puede ser menor o igual a 0");
            } else {
                return 2 * Math.PI * radio;
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }

    public static double areaCirculo(float radio) {
        try {
            if (radio <= 0) {
                throw new IllegalArgumentException("El radio no puede ser menor o igual a 0");
            } else {
                return Math.PI * radio * radio;
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }

    //Esfera:
    // Area: 4 x pi x radio x radio
    // Volumen: (4/3) x pi x radio x radio x radio
    public static double areaEsfera(float radio) {
        try {
            if (radio <= 0) {
                throw new IllegalArgumentException("El radio no puede ser menor o igual a 0");
            } else {
                return 4 * Math.PI * radio * radio;
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }

    public static double volumenEsfera(float radio) {
        try {
            if (radio <= 0) {
                throw new IllegalArgumentException("El radio no puede ser menor o igual a 0");
            } else {
                return ((double) 4 / 3) * Math.PI * radio * radio * radio;
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }

    //Cubo:
    // Perimetro: 12 x lado
    // Volumen: lado x lado x lado
    // Area: 6 x lado x lado
    public static float perimetroCubo(float lado) {
        try {
            if (lado <= 0) {
                throw new IllegalArgumentException("El lado no puede ser menor o igual a 0");
            } else {
                return 12 * lado;
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }

    public static float areaCubo(float lado) {
        try {
            if (lado <= 0) {
                throw new IllegalArgumentException("El lado no puede ser menor o igual a 0");
            } else {
                return 6 * lado * lado;
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }

    public static float volumenCubo(float lado) {
        try {
            if (lado <= 0) {
                throw new IllegalArgumentException("El lado no puede ser menor o igual a 0");
            } else {
                return lado * lado * lado;
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }

    //Cono:
    // Area: pi x radio x radio + raiz cuadrada de (radio x radio + altura x altura)
    // Volumen: pi x radio x radio x altura)/3
    public static double areaCono(float radio, float altura) {
        try {
            if (radio <= 0 || altura <= 0) {
                throw new IllegalArgumentException("El radio y la altura no pueden ser menores o iguales a 0");
            } else {
                double areaCirculo = areaCirculo(radio);
                double areaTriangulo = Math.PI * radio * (Math.sqrt((radio * radio) + (altura * altura)));
                return areaCirculo + areaTriangulo;
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }

    public static double volumenCono(float radio, float altura) {
        try {
            if (radio <= 0 || altura <= 0) {
                throw new IllegalArgumentException("El radio y la altura no pueden ser menores o iguales a 0");
            } else {
                return ((Math.PI * (radio * radio) * altura) / 3);
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }
}
