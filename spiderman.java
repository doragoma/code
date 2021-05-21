public void Teleport(Player p) {
    Vector diff = p.getLocation().getDirection().normalize();
    diff.setX(diff.getX()*1.2);
    diff.setY(diff.getY()*1.5);
    diff.setZ(diff.getZ()*1.2);
    p.setVelocity(diff);
}
