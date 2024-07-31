public class Main {
    public static void main(String[] args) {
        Computer basicComputer = new Computer.Builder()
                .setCPU("Intel i5")
                .setRAM("8GB")
                .setStorage("256GB SSD")
                .build();

        System.out.println("Basic Computer Configuration: " + basicComputer);

        // Creating a gaming computer configuration
        Computer gamingComputer = new Computer.Builder()
                .setCPU("Intel i9")
                .setRAM("32GB")
                .setStorage("1TB SSD")
                .setGPU("NVIDIA RTX 3080")
                .setMotherboard("ASUS ROG")
                .setPowerSupply("750W")
                .setCaseType("ATX")
                .build();

        System.out.println("Gaming Computer Configuration: " + gamingComputer);

        // Creating a workstation computer configuration
        Computer workstationComputer = new Computer.Builder()
                .setCPU("AMD Ryzen 9")
                .setRAM("64GB")
                .setStorage("2TB SSD")
                .setGPU("NVIDIA Quadro RTX 4000")
                .setMotherboard("MSI Creator")
                .setPowerSupply("850W")
                .setCaseType("E-ATX")
                .build();

        System.out.println("Workstation Computer Configuration: " + workstationComputer);
    }
}