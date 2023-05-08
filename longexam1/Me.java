public class Me implements Tourist {

    static int budget = 1000;

    public void visit() {
        System.out.print("Enjoying my stay");
    }

    public void visit(Boracay boracay) {

        budget -= boracay.airFare;

        System.out.println("*.·:·.✧ ✦ ✧.·:·.*");
        System.out.println("Arriving in Boracay ◝(ᵔᵕᵔ)◜");
        System.out.println("AAAAA, the beach here is pure white, it looks like heaven (•o•)!");
        checkBudget();
        System.out.println("*.·:·.✧ ✦ ✧.·:·.*");

    }

    public void visit(Baguio baguio) {

        budget -= baguio.airFare;

        System.out.println("*.·:·.✧ ✦ ✧.·:·.*");
        System.out.println("Arriving in Baguio ◝(ᵔᵕᵔ)◜");
        System.out.println("Am I outside the PH? It's so cold, I had chills (⚈₋₍⚈)!! ");
        checkBudget();
        System.out.println("*.·:·.✧ ✦ ✧.·:·.*");

    }

    public void visit(Bataan bataan) {

        budget -= bataan.airFare;

        System.out.println("*.·:·.✧ ✦ ✧.·:·.*");
        System.out.println("Arriving in Bataan ◝(ᵔᵕᵔ)◜");
        System.out.println("Yoooo, the beaches here are so cool! Waah big waves ٩(ˊᗜˋ*)و!! ");
        checkBudget();
        System.out.println("*.·:·.✧ ✦ ✧.·:·.*");

    }

    public void visit(Batangas batangas) {

        budget -= batangas.airFare;

        System.out.println("*.·:·.✧ ✦ ✧.·:·.*");
        System.out.println("Arriving in Batangas ◝(ᵔᵕᵔ)◜");
        System.out.println("This place has so many beaches, wow (*o*)!! ");
        checkBudget();
        System.out.println("*.·:·.✧ ✦ ✧.·:·.*");

    }

    public void visit(Bohol bohol) {

        budget -= bohol.airFare;

        System.out.println("*.·:·.✧ ✦ ✧.·:·.*");
        System.out.println("Arriving in Bohol ◝(ᵔᵕᵔ)◜");
        System.out.println("Wow, I want to eat those chocolate hills (๑ᵔ⤙ᵔ๑)!!");
        checkBudget();
        System.out.println("*.·:·.✧ ✦ ✧.·:·.*");

    }

    public void visit(Siargao siargao) {

        budget -= siargao.airFare;

        System.out.println("*.·:·.✧ ✦ ✧.·:·.*");
        System.out.println("Arriving in Siargao ◝(ᵔᵕᵔ)◜");
        System.out.println("Wow, this island is a paradise (*o*)!!");
        checkBudget();
        System.out.println("*.·:·.✧ ✦ ✧.·:·.*");

    }


    public void checkBudget() {
        System.out.println("My budget is " + budget);
    }


    
}