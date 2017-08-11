import javax.inject.Inject;

public class GameSession {
    // called: 'setter injection' (https://en.wikipedia.org/wiki/Dependency_injection)
    @Inject
    public GameData data;
}
