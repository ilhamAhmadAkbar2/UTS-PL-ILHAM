class Cuboid {
    double edgeA;
    double edgeB;
    double edgeC;

    public Cuboid(double edgeA, double edgeB, double edgeC) {
        this.edgeA = edgeA;
        this.edgeB = edgeB;
        this.edgeC = edgeC;
    }

    public double calculateVolume() {
        return edgeA * edgeB * edgeC;
    }

    public double calculateSurfaceArea() {
        return 2 * (edgeA * edgeB + edgeA * edgeC + edgeB * edgeC);
    }
}

public class Main {
    public static void main(String[] args) {
        Cuboid[] cuboids = {
                new Cuboid(39.76, 52.18, 64.78),
                new Cuboid(22.48, 48.65, 44.65),
                new Cuboid(64.12, 24.47, 56.33),
                new Cuboid(49.55, 79.84, 84.36),
                new Cuboid(62.41, 42.53, 67.90),
                new Cuboid(77.35, 59.27, 61.03),
                new Cuboid(48.77, 61.44, 23.23),
                new Cuboid(29.16, 37.16, 59.92),
                new Cuboid(34.37, 52.36, 62.53),
                new Cuboid(68.55, 53.40, 53.84),
                new Cuboid(66.53, 22.51, 45.32),
                new Cuboid(38.66, 55.26, 51.88),
                new Cuboid(90.97, 51.05, 40.98),
                new Cuboid(57.22, 46.93, 46.93),
                new Cuboid(74.41, 63.51, 16.23),
                new Cuboid(83.99, 38.44, 48.69),
                new Cuboid(42.83, 32.47, 36.11),
                new Cuboid(74.49, 38.71, 19.14),
                new Cuboid(43.61, 43.66, 67.66),
                new Cuboid(58.31, 67.88, 63.21),
                new Cuboid(60.26, 58.38, 58.73),
                new Cuboid(67.38, 42.48, 12.36),
                new Cuboid(43.91, 62.92, 71.05),
                new Cuboid(38.99, 38.63, 62.47),
                new Cuboid(41.19, 63.80, 51.79),
                new Cuboid(32.38, 49.14, 33.17),
                new Cuboid(67.17, 47.17, 55.39),
                new Cuboid(66.46, 29.29, 65.84),
                new Cuboid(51.74, 66.28, 66.83),
                new Cuboid(58.62, 41.74, 19.40),
                new Cuboid(36.02, 90.85, 82.89),
                new Cuboid(36.22, 53.63, 94.85),
                new Cuboid(39.40, 72.47, 70.30),
                new Cuboid(66.95, 40.93, 57.24),
                new Cuboid(76.93, 73.66, 74.76),
                new Cuboid(58.36, 67.85, 77.58),
                new Cuboid(72.24, 67.33, 67.72),
                new Cuboid(46.12, 89.55, 89.18),
                new Cuboid(76.49, 58.93, 77.63),
                new Cuboid(95.20, 67.35, 38.76),
                new Cuboid(48.65, 38.26, 98.59),
                new Cuboid(48.63, 47.73, 70.16),
                new Cuboid(40.85, 83.69, 28.85),
                new Cuboid(55.41, 43.18, 54.84),
                new Cuboid(39.76, 52.18, 64.78),
                new Cuboid(22.48, 48.65, 44.65),
                new Cuboid(64.12, 24.47, 56.33),
                new Cuboid(49.55, 79.84, 84.36),
                new Cuboid(62.41, 42.53, 67.90),
                new Cuboid(39.76, 52.18, 64.78),
                new Cuboid(22.48, 48.65, 44.65),
                new Cuboid(64.12, 24.47, 56.33),
                new Cuboid(49.55, 79.84, 84.36),
                new Cuboid(62.41, 42.53, 67.90),
                new Cuboid(77.35, 59.27, 61.03),
                new Cuboid(48.77, 61.44, 23.23),
                new Cuboid(29.16, 37.16, 59.92),
                new Cuboid(34.37, 52.36, 62.53),
                new Cuboid(68.55, 53.40, 53.84),
                new Cuboid(66.53, 22.51, 45.32),
                new Cuboid(38.66, 55.26, 51.88),
                new Cuboid(90.97, 51.05, 40.98),
                new Cuboid(57.22, 46.93, 46.93),
                new Cuboid(74.41, 63.51, 16.23),
                new Cuboid(83.99, 38.44, 48.69),
                new Cuboid(42.83, 32.47, 36.11),
                new Cuboid(74.49, 38.71, 19.14),
                new Cuboid(43.61, 43.66, 67.66),
                new Cuboid(58.31, 67.88, 63.21),
                new Cuboid(60.26, 58.38, 58.73),
                new Cuboid(67.38, 42.48, 12.36),
                new Cuboid(43.91, 62.92, 71.05),
                new Cuboid(38.99, 38.63, 62.47),
                new Cuboid(41.19, 63.80, 51.79),
                new Cuboid(32.38, 49.14, 33.17),
                new Cuboid(67.17, 47.17, 55.39),
                new Cuboid(66.46, 29.29, 65.84),
                new Cuboid(51.74, 66.28, 66.83),
                new Cuboid(58.62, 41.74, 19.40),
                new Cuboid(36.02, 90.85, 82.89),
                new Cuboid(36.22, 53.63, 94.85),
                new Cuboid(39.40, 72.47, 70.30),
                new Cuboid(66.95, 40.93, 57.24),
                new Cuboid(76.93, 73.66, 74.76),
                new Cuboid(58.36, 67.85, 77.58),
                new Cuboid(72.24, 67.33, 67.72),
                new Cuboid(46.12, 89.55, 89.18),
                new Cuboid(76.49, 58.93, 77.63),
                new Cuboid(95.20, 67.35, 38.76),
                new Cuboid(48.65, 38.26, 98.59),
                new Cuboid(48.63, 47.73, 70.16),
                new Cuboid(40.85, 83.69, 28.85),
                new Cuboid(55.41, 43.18, 54.84),
                new Cuboid(39.76, 52.18, 64.78),
                new Cuboid(22.48, 48.65, 44.65),
                new Cuboid(64.12, 24.47, 56.33),
                new Cuboid(49.55, 79.84, 84.36),
                new Cuboid(62.41, 42.53, 67.90),
                new Cuboid(39.76, 52.18, 64.78),
                new Cuboid(22.48, 48.65, 44.65),
                new Cuboid(64.12, 24.47, 56.33),
                new Cuboid(49.55, 79.84, 84.36),
                new Cuboid(62.41, 42.53, 67.90),
                new Cuboid(77.35, 59.27, 61.03),
                new Cuboid(48.77, 61.44, 23.23),
                new Cuboid(29.16, 37.16, 59.92),
                new Cuboid(34.37, 52.36, 62.53),
                new Cuboid(68.55, 53.40, 53.84),
                new Cuboid(66.53, 22.51, 45.32),
                new Cuboid(38.66, 55.26, 51.88),
                new Cuboid(90.97, 51.05, 40.98),
                new Cuboid(57.22, 46.93, 46.93),
                new Cuboid(74.41, 63.51, 16.23),
                new Cuboid(83.99, 38.44, 48.69),
                new Cuboid(42.83, 32.47, 36.11),
                new Cuboid(74.49, 38.71, 19.14),
                new Cuboid(43.61, 43.66, 67.66),
                new Cuboid(58.31, 67.88, 63.21),
                new Cuboid(60.26, 58.38, 58.73),
                new Cuboid(67.38, 42.48, 12.36),
                new Cuboid(43.91, 62.92, 71.05),
                new Cuboid(38.99, 38.63, 62.47),
                new Cuboid(41.19, 63.80, 51.79),
                new Cuboid(32.38, 49.14, 33.17),
                new Cuboid(67.17, 47.17, 55.39),
                new Cuboid(66.46, 29.29, 65.84),
                new Cuboid(51.74, 66.28, 66.83),
                new Cuboid(58.62, 41.74, 19.40),
                new Cuboid(36.02, 90.85, 82.89),
                new Cuboid(36.22, 53.63, 94.85),
                new Cuboid(39.40, 72.47, 70.30),
                new Cuboid(66.95, 40.93, 57.24),
                new Cuboid(76.93, 73.66, 74.76),
                new Cuboid(58.36, 67.85, 77.58),
                new Cuboid(72.24, 67.33, 67.72),
                new Cuboid(46.12, 89.55, 89.18),
                new Cuboid(76.49, 58.93, 77.63),
                new Cuboid(95.20, 67.35, 38.76),
                new Cuboid(48.65, 38.26, 98.59),
                new Cuboid(48.63, 47.73, 70.16),
                new Cuboid(40.85, 83.69, 28.85),
                new Cuboid(55.41, 43.18, 54.84),
                new Cuboid(39.76, 52.18, 64.78),
                new Cuboid(22.48, 48.65, 44.65),
                new Cuboid(64.12, 24.47, 56.33),
                new Cuboid(49.55, 79.84, 84.36),
                new Cuboid(62.41, 42.53, 67.90),
                new Cuboid(76.49, 58.93, 77.63),
                new Cuboid(95.20, 67.35, 38.76),
                new Cuboid(55.41, 43.18, 54.84)
        };


        for (int i = 0; i < cuboids.length; i++) {
            Cuboid cuboid = cuboids[i];
            double volume = cuboid.calculateVolume();
            double surfaceArea = cuboid.calculateSurfaceArea();
            System.out.println("Cuboid " + (i + 1) + ":");
            System.out.println("Volume: " + volume);
            System.out.println("Luas Permukaan: " + surfaceArea);
            System.out.println();
        }

    }
}