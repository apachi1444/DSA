 static void doubleConsumer() {
        List cities = Arrays.asList("Kech", "Casa");
        Consumer<List<String>> upperCaseConsumer = list -> {
            for (int i = 0; i < list.size(); i++) {
                list.set(i, list.get(i).toUpperCase());
            }
        };

        Consumer<List<String>> printListConsumer = list -> {
            list.stream().forEach(System.out::println);
        };

        upperCaseConsumer.andThen(printListConsumer).accept(cities);

    }

    static void optionalSupplier() {

        Supplier<Double> supplier = () -> Math.random() + 12;
        Optional<Double> optionalDouble = (Optional.empty());

        System.out.println(optionalDouble.orElseGet(supplier));

    }

    static void testPredicate() {
        List list = Arrays.asList("Yessine ", "Jaoua");
        Predicate<String> stringStartsWithS = str -> str.startsWith("Y");
        list.stream().filter(stringStartsWithS).forEach(System.out::println);
    }

    static void testReduceTerminateFunction() {
        List<String> list = Arrays.asList("Hahahaha", "Yoyoyo", "JAOUA");
        int result = list.stream().map(i -> i.length()).reduce(0, (ans, i) -> (ans + i));
        System.out.println(result);
    }

    static void testPredicateAndComposition() {
        List<String> names = Arrays.asList("John", "Smith", "Samueal", "Catley", "Sie");
        Predicate<String> startPredicate = str -> str.startsWith("S");
        Predicate<String> lengthPredicate = str -> str.length() >= 5;
        names.stream().filter(startPredicate.and(lengthPredicate)).forEach(System.out::println);
    }
