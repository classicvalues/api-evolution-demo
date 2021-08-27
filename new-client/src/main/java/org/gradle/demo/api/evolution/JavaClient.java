package org.gradle.demo.api.evolution;

public class JavaClient {
    public static void main() {
        System.out.println(run(new Server()));
    }

    private static String run(Server server) {
        server.getTestProperty().set("lajos");
        return server.getTestProperty().get();
    }
}