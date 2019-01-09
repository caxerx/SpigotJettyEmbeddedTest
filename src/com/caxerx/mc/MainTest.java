package com.caxerx.mc;

import org.bukkit.plugin.java.JavaPlugin;
import org.eclipse.jetty.server.Server;

public class MainTest extends JavaPlugin {
    @Override
    public void onLoad() {
        Server server = new Server(8080);
        server.setHandler(new HandleFeedback());
        try {
            server.start();
            server.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
