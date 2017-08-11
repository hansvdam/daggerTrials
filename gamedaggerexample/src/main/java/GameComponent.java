import dagger.Component;

// called: 'interface injection' (https://en.wikipedia.org/wiki/Dependency_injection)
@Component(modules = GameModule.class)
public interface GameComponent {
    void inject(GameSession obj);
}
