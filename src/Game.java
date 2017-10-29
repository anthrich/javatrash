public class Game {

    IGameInterface _gameInterface;
    Grid _grid;

    public Game(IGameInterface gameInterface)
    {
        _gameInterface = gameInterface;
        _grid = new Grid();
        gameInterface.DrawGrid(_grid);
    }

    public void Update()
    {
        // do stuff
    }
}
