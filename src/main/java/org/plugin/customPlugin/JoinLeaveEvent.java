package org.plugin.customPlugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.jetbrains.annotations.NotNull;

public class JoinLeaveEvent implements Listener {

  @EventHandler
  public void onJoin(@NotNull PlayerJoinEvent e) {

    Player p = e.getPlayer();
    if (p.hasPlayedBefore()) {
      e.setJoinMessage(Hex.code("#2ff40a") + "❱ " + p.getDisplayName());
    } else {
      e.setJoinMessage(Hex.code("#ffd700") + "❱ " + p.getDisplayName());
    }
  }

  @EventHandler
  public void onLeave(@NotNull PlayerQuitEvent e) {

    Player p = e.getPlayer();
    e.setQuitMessage(Hex.code("#f05650") + "❰ " + p.getDisplayName());
  }
}

