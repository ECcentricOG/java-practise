class Demo{

        public static void main(String [] args){

                StringBuffer sb = new StringBuffer();
                System.out.println(sb.length());
                System.out.println(sb.capacity());
                System.out.println(System.identityHashCode(sb));
                System.out.println(sb);

                sb.append("Shashi");
                System.out.println(sb.length());
                System.out.println(sb.capacity());
                System.out.println(System.identityHashCode(sb));
                System.out.println(sb);

                sb.append("Bagal");
                System.out.println(sb.length());
                System.out.println(sb.capacity());
                System.out.println(System.identityHashCode(sb));
                System.out.println(sb);

                sb.append("Core2Web");
                System.out.println(sb.length());
                System.out.println(sb.capacity());
                System.out.println(System.identityHashCode(sb));
                System.out.println(sb);
        }
}

