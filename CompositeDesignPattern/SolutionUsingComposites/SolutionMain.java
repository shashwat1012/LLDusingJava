package CompositeDesignPattern.SolutionUsingComposites;

public class SolutionMain {
    
    public static void main(String args[]) {

        Directory movieDirectory = new Directory("Movies");
        File JohnWick = new File("JohnWick");
        movieDirectory.add(JohnWick);

        Directory actionMovies = new Directory("ActionMovies");
        File Creed = new File("Creed");
        actionMovies.add(Creed);
        movieDirectory.add(actionMovies);
        movieDirectory.ls();
    }
}
