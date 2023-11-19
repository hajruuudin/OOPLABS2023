package Task3;

import java.util.Objects;

public record Employee(int id, String name, double salary) {
    public Employee{
        Objects.requireNonNull(id);
        Objects.requireNonNull(name);
        Objects.requireNonNull(salary);
    }
}
