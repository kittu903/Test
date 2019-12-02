package main;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Partition {

    public static void main(String[] args) {
        final List<String> list = Arrays.asList("A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","X");

        final AtomicInteger counter = new AtomicInteger(0);
        final int size = 5;

        final Collection<List<String>> partitioned = list.stream()
                .collect(Collectors.groupingBy(it -> counter.getAndIncrement() / size))
                .values();

        partitioned.forEach(System.out::println);
    }
}