//2_3_ComputerBuilder
Computer com = new Computer.Builder("Intel i7", 16)
    .storage(512)
    .gpu("RTX 3060")
    .os("Windows 11")
    .build();