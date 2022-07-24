package space.sanc.passivephantoms.listeners;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityTargetLivingEntityEvent;
import space.sanc.passivephantoms.PassivePhantomsPlugin;

public class TargetEvent implements Listener {

    private final PassivePhantomsPlugin pl;

    public TargetEvent(PassivePhantomsPlugin pl) {
        this.pl = pl;
    }

    @EventHandler
    public void onTarget(EntityTargetLivingEntityEvent e) {
        if (pl.getConfig().getBoolean("phantoms.passive")
        && e.getEntityType() == EntityType.PHANTOM) {
            e.setCancelled(true);
        }
    }

}
