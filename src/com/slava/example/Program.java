package com.slava.example;

import java.util.Arrays;

public class Program {
    public static void main(String[] args) throws Exception {

        Program program = new Program();

        try {
            program.throwable();
        } catch (Exception e) {
            System.out.println("Exception : \n" + e.toString() + '\n');
            System.out.println("Cause of Checked Exception : \n" + e.getCause() + '\n');
            System.out.println("Suppressed Exception : \n" + Arrays.toString(e.getSuppressed()) + '\n');
        }
    }

    private void throwable() throws Exception {

        try (Worker worker = new Worker()) {
            worker.work();
        }catch (Exception ue) {
            ue.initCause(new ErrorExceptions("Ошибочка"));
            throw ue;
        }
    }
}
