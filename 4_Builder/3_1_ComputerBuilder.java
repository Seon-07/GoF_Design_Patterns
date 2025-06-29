//3_1_ComputerBuilder
Computer com = new Computer.Builder("Intel i7", 16)
    .storage(512)
    .gpu("RTX 4070")
    .os("Windows 11")
    .build();