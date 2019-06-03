class WhackAMole extends GameBooth{
    private boolean[][] grid = new boolean[2][3];
    private int score = 0;
    Scanner stdin;
    public WhackAMole(double cost, String smallPrize, String largePrize, Scanner stdin){
        super(cost, smallPrize, largePrize);
        this.stdin = stdin;
        for (int r = 0; r < 2; r++){
            for (int c = 0; c < 3; c++){
                grid[r][c] = false;
            }
        }
    }

    public String start(){
        printGrid();
        timedIteration(500);
        for (int x=0; x<45; x++){
            int[][] coords = randomizeGrid();
            printGrid();
            timedIteration((long)(Math.Random()*700+300), acceptWhack());
            
        }

    }
    private void printGrid(){
        System.out.println("____________________            Score: "+score);
        for (int r=0; r<2; r++){
            printRow(r);
        }
    }

    private void printRow(int row){
        for (int c=0; c<3; c++){
            System.out.print("|"+moleConvert(grid[row][c]));
        }
        System.out.println("|");
        System.out.println("____________________");
    }

    private String moleConvert(boolean status){
        if (status){
            return "()-()\n \\\"/ \n  `";
        }
        return "____";
    }

    private void clearGrid(int[][] coords){
        for (r=0; r < coords.length; r++){
            grid[coords[r][0]][coords[r][1]]=false;
        }
    }

    private int[][] randomizeGrid(){
        int numMoles = (int)(Math.Random()*4)+1;
        int[][] coords = new int[numMoles][2];
        for (int r=0; r<numMoles; r++){
            coords[r][0]=(int)(Math.Random()*2);
            coords[r][1]=(int)(Math.Random()*3);
            grid[coords[r][0]][coords[r][1]]=true;
        }
        return coords;
    }
    private void timedIteration(long milisec){         //Citation -- some code segments in this method are cited from @ninWM on Stack Overflow
        long startTime = System.currentTimeMillis();
        long elapsedTime = 0L;

        while (elapsedTime < milisec) {
            elapsedTime = (new Date()).getTime() - startTime; 
        }
    }

    private void timedIteration(long milisec, Callable<T> func){         //Citation -- some code segments in this method are cited from @ninWM on Stack Overflow
        long startTime = System.currentTimeMillis();
        long elapsedTime = 0L;

        while (elapsedTime < milisec) {
            func.call();
            elapsedTime = (new Date()).getTime() - startTime; 
        }
    }

    private void acceptWhack(){
    switch(stdin.next().toLowerCase()){

    }
}
}