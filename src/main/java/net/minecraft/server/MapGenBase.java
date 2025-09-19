package net.minecraft.server;

import java.util.Random;

public class MapGenBase {

    protected int a = 8;
    protected Random b = new Random();
    protected World worldObj;

    public MapGenBase() {}

    public void a(IChunkProvider ichunkprovider, World world, int i, int j, byte[] abyte) {
        int k = this.a;
        this.worldObj = world;
        this.b.setSeed(world.getCavesSeed()); // Poseidon 'getSeed()' -> 'getCavesSeed()'
        long l = this.b.nextLong();
        long i1 = this.b.nextLong();

        for (int j1 = i - k; j1 <= i + k; ++j1) {
            for (int k1 = j - k; k1 <= j + k; ++k1) {
                long sx = (long) j1 * l;
                long sz = (long) k1 * i1;
                this.b.setSeed(sx ^ sz ^ world.getCavesSeed()); // Poseidon 'getSeed()' -> 'getCavesSeed()'
                this.a(world, j1, k1, i, j, abyte);
            }
        }
    }

    protected void a(World world, int i, int j, int k, int l, byte[] abyte) {}
}
