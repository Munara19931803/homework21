public enum Week {
    MONDAY {
        @Override
        public void method() {
            System.out.println("теориялык сабак");
        }
    },
    TUESDAY {
        @Override
        public void method() {
            System.out.println("практилык сабак");

        }
    },
    WEDNESDAY {
        @Override
        public void method() {
            System.out.println("теориялык сабак");
        }
    },
    THURSDAY {
        @Override
        public void method() {
            System.out.println("практикалык сабак");

        }
    },
    FRIDAY {
        @Override
        public void method() {
            System.out.println("англиский сабак");

        }
    },
    SATURDAY {
        @Override
        public void method() {
            System.out.println("практикалык сабак ");
        }
    },
    SANDAY {
        @Override
        public void method() {
            System.out.println("выходной");
        }
    };


    public abstract void method();


}
