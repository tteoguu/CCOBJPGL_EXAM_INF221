interface Tourist {

    int budget = 0;

    void visit();

    void visit(Boracay boracay); 

    void visit(Baguio baguio);

    void visit(Bataan bataan);

    void visit(Batangas batangas);

    void visit(Bohol elnido);

    void visit(Siargao launion);




    default void visit(Locations locations) {
        System.out.println("Arrived on a location");
    };

    void checkBudget();
}