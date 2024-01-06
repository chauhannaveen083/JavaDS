import java.io.*;
import java.util.*;

public class Floating point output {
    public static void main(String[] args) {
        double pi = 3.141592653589793;
        System.out.println(String.format("%.2f",pi));
        System.out.println(String.format("%.9f",pi));
        System.out.println(String.format("%.15f",pi));
    }
}