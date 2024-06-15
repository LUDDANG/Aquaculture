package com.teammetallurgy.aquaculture.entity;

import org.bukkit.*;
import org.bukkit.block.BlockFace;
import org.bukkit.block.PistonMoveReaction;
import org.bukkit.entity.*;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.permissions.Permission;
import org.bukkit.permissions.PermissionAttachment;
import org.bukkit.permissions.PermissionAttachmentInfo;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.plugin.Plugin;
import org.bukkit.util.BoundingBox;
import org.bukkit.util.Vector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public class CustomItemEntry implements Item {
    public final List<net.minecraft.world.item.ItemStack> lootEntries;
    public final List<net.minecraft.world.item.ItemStack> doubleLoot;

    public CustomItemEntry(List<net.minecraft.world.item.ItemStack> lootEntries, List<net.minecraft.world.item.ItemStack> doubleLoot) {
        this.lootEntries = new ArrayList<>(lootEntries);
        this.doubleLoot = new ArrayList<>(doubleLoot);
    }

    @NotNull
    @Override
    public ItemStack getItemStack() {
        return null;
    }

    @Override
    public void setItemStack(@NotNull ItemStack itemStack) {

    }

    @Override
    public int getPickupDelay() {
        return 0;
    }

    @Override
    public void setPickupDelay(int i) {

    }

    @Override
    public boolean isUnlimitedLifetime() {
        return false;
    }

    @Override
    public void setUnlimitedLifetime(boolean b) {

    }

    @Nullable
    @Override
    public UUID getOwner() {
        return null;
    }

    @Override
    public void setOwner(@Nullable UUID uuid) {

    }

    @Nullable
    @Override
    public UUID getThrower() {
        return null;
    }

    @Override
    public void setThrower(@Nullable UUID uuid) {

    }

    @NotNull
    @Override
    public Location getLocation() {
        return null;
    }

    @Nullable
    @Override
    public Location getLocation(@Nullable Location location) {
        return null;
    }

    @NotNull
    @Override
    public Vector getVelocity() {
        return null;
    }

    @Override
    public void setVelocity(@NotNull Vector vector) {

    }

    @Override
    public double getHeight() {
        return 0;
    }

    @Override
    public double getWidth() {
        return 0;
    }

    @NotNull
    @Override
    public BoundingBox getBoundingBox() {
        return null;
    }

    @Override
    public boolean isOnGround() {
        return false;
    }

    @Override
    public boolean isInWater() {
        return false;
    }

    @NotNull
    @Override
    public World getWorld() {
        return null;
    }

    @Override
    public void setRotation(float v, float v1) {

    }

    @Override
    public boolean teleport(@NotNull Location location) {
        return false;
    }

    @Override
    public boolean teleport(@NotNull Location location, @NotNull PlayerTeleportEvent.TeleportCause teleportCause) {
        return false;
    }

    @Override
    public boolean teleport(@NotNull Entity entity) {
        return false;
    }

    @Override
    public boolean teleport(@NotNull Entity entity, @NotNull PlayerTeleportEvent.TeleportCause teleportCause) {
        return false;
    }

    @NotNull
    @Override
    public List<Entity> getNearbyEntities(double v, double v1, double v2) {
        return List.of();
    }

    @Override
    public int getEntityId() {
        return 0;
    }

    @Override
    public int getFireTicks() {
        return 0;
    }

    @Override
    public void setFireTicks(int i) {

    }

    @Override
    public int getMaxFireTicks() {
        return 0;
    }

    @Override
    public boolean isVisualFire() {
        return false;
    }

    @Override
    public void setVisualFire(boolean b) {

    }

    @Override
    public int getFreezeTicks() {
        return 0;
    }

    @Override
    public void setFreezeTicks(int i) {

    }

    @Override
    public int getMaxFreezeTicks() {
        return 0;
    }

    @Override
    public boolean isFrozen() {
        return false;
    }

    @Override
    public void remove() {

    }

    @Override
    public boolean isDead() {
        return false;
    }

    @Override
    public boolean isValid() {
        return false;
    }

    @Override
    public void sendMessage(@NotNull String s) {

    }

    @Override
    public void sendMessage(@NotNull String... strings) {

    }

    @Override
    public void sendMessage(@Nullable UUID uuid, @NotNull String s) {

    }

    @Override
    public void sendMessage(@Nullable UUID uuid, @NotNull String... strings) {

    }

    @NotNull
    @Override
    public Server getServer() {
        return null;
    }

    @NotNull
    @Override
    public String getName() {
        return "";
    }

    @Override
    public boolean isPersistent() {
        return false;
    }

    @Override
    public void setPersistent(boolean b) {

    }

    @Nullable
    @Override
    public Entity getPassenger() {
        return null;
    }

    @Override
    public boolean setPassenger(@NotNull Entity entity) {
        return false;
    }

    @NotNull
    @Override
    public List<Entity> getPassengers() {
        return List.of();
    }

    @Override
    public boolean addPassenger(@NotNull Entity entity) {
        return false;
    }

    @Override
    public boolean removePassenger(@NotNull Entity entity) {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean eject() {
        return false;
    }

    @Override
    public float getFallDistance() {
        return 0;
    }

    @Override
    public void setFallDistance(float v) {

    }

    @Nullable
    @Override
    public EntityDamageEvent getLastDamageCause() {
        return null;
    }

    @Override
    public void setLastDamageCause(@Nullable EntityDamageEvent entityDamageEvent) {

    }

    @NotNull
    @Override
    public UUID getUniqueId() {
        return null;
    }

    @Override
    public int getTicksLived() {
        return 0;
    }

    @Override
    public void setTicksLived(int i) {

    }

    @Override
    public void playEffect(@NotNull EntityEffect entityEffect) {

    }

    @NotNull
    @Override
    public EntityType getType() {
        return null;
    }

    @NotNull
    @Override
    public Sound getSwimSound() {
        return null;
    }

    @NotNull
    @Override
    public Sound getSwimSplashSound() {
        return null;
    }

    @NotNull
    @Override
    public Sound getSwimHighSpeedSplashSound() {
        return null;
    }

    @Override
    public boolean isInsideVehicle() {
        return false;
    }

    @Override
    public boolean leaveVehicle() {
        return false;
    }

    @Nullable
    @Override
    public Entity getVehicle() {
        return null;
    }

    @Override
    public boolean isCustomNameVisible() {
        return false;
    }

    @Override
    public void setCustomNameVisible(boolean b) {

    }

    @Override
    public boolean isVisibleByDefault() {
        return false;
    }

    @Override
    public void setVisibleByDefault(boolean b) {

    }

    @Override
    public boolean isGlowing() {
        return false;
    }

    @Override
    public void setGlowing(boolean b) {

    }

    @Override
    public boolean isInvulnerable() {
        return false;
    }

    @Override
    public void setInvulnerable(boolean b) {

    }

    @Override
    public boolean isSilent() {
        return false;
    }

    @Override
    public void setSilent(boolean b) {

    }

    @Override
    public boolean hasGravity() {
        return false;
    }

    @Override
    public void setGravity(boolean b) {

    }

    @Override
    public int getPortalCooldown() {
        return 0;
    }

    @Override
    public void setPortalCooldown(int i) {

    }

    @NotNull
    @Override
    public Set<String> getScoreboardTags() {
        return Set.of();
    }

    @Override
    public boolean addScoreboardTag(@NotNull String s) {
        return false;
    }

    @Override
    public boolean removeScoreboardTag(@NotNull String s) {
        return false;
    }

    @NotNull
    @Override
    public PistonMoveReaction getPistonMoveReaction() {
        return null;
    }

    @NotNull
    @Override
    public BlockFace getFacing() {
        return null;
    }

    @NotNull
    @Override
    public Pose getPose() {
        return null;
    }

    @NotNull
    @Override
    public SpawnCategory getSpawnCategory() {
        return null;
    }

    @NotNull
    @Override
    public Spigot spigot() {
        return null;
    }

    @Nullable
    @Override
    public String getCustomName() {
        return "";
    }

    @Override
    public void setCustomName(@Nullable String s) {

    }

    @Override
    public void setMetadata(@NotNull String s, @NotNull MetadataValue metadataValue) {

    }

    @NotNull
    @Override
    public List<MetadataValue> getMetadata(@NotNull String s) {
        return List.of();
    }

    @Override
    public boolean hasMetadata(@NotNull String s) {
        return false;
    }

    @Override
    public void removeMetadata(@NotNull String s, @NotNull Plugin plugin) {

    }

    @Override
    public boolean isPermissionSet(@NotNull String s) {
        return false;
    }

    @Override
    public boolean isPermissionSet(@NotNull Permission permission) {
        return false;
    }

    @Override
    public boolean hasPermission(@NotNull String s) {
        return false;
    }

    @Override
    public boolean hasPermission(@NotNull Permission permission) {
        return false;
    }

    @NotNull
    @Override
    public PermissionAttachment addAttachment(@NotNull Plugin plugin, @NotNull String s, boolean b) {
        return null;
    }

    @NotNull
    @Override
    public PermissionAttachment addAttachment(@NotNull Plugin plugin) {
        return null;
    }

    @Nullable
    @Override
    public PermissionAttachment addAttachment(@NotNull Plugin plugin, @NotNull String s, boolean b, int i) {
        return null;
    }

    @Nullable
    @Override
    public PermissionAttachment addAttachment(@NotNull Plugin plugin, int i) {
        return null;
    }

    @Override
    public void removeAttachment(@NotNull PermissionAttachment permissionAttachment) {

    }

    @Override
    public void recalculatePermissions() {

    }

    @NotNull
    @Override
    public Set<PermissionAttachmentInfo> getEffectivePermissions() {
        return Set.of();
    }

    @Override
    public boolean isOp() {
        return false;
    }

    @Override
    public void setOp(boolean b) {

    }

    @NotNull
    @Override
    public PersistentDataContainer getPersistentDataContainer() {
        return null;
    }
}
