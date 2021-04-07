// Main class used to test and analyze two lists implemented by hashing.
//
//  David John
//  April 2021


public class Main {

    // for testing search for these keys
    private static final String []  mykeylist = {"CA", "VA", "NY", "AK", "TN", "WI", "PR", "CT"};

    // testing routine
    public static void main(String[] args) {

        StringMap ASM = new ArrayStringMap();
        StringMapExample(ASM);

        System.out.println();

        ASM = new HashStringMap();       // think about what this has done
        StringMapExample(ASM);
    }

    // method to create and test StringMap
    public static void StringMapExample(StringMap myStringMap){

        // create and initialize myStringMap for array based hashing
        //StringMap myStringMap = new ArrayStringMap();
        setup(myStringMap);

        System.out.println();
        System.out.println("****  TEST OF "+myStringMap);
        System.out.println();

        double psum = 0.0;      // set initial number of probes

        // report number of probes for the testing keys
        for (String mykey : mykeylist){
            System.out.print(mykey+ " : ");
            String theValue = myStringMap.get(mykey);
            System.out.printf("%15s",(theValue != null) ? theValue : "null");
            System.out.println(" : "+myStringMap.getProbes());
            psum += myStringMap.getProbes();
        }

        System.out.printf("%nTotal number of probes: %8.0f%n",psum);
        System.out.printf("Average number of probes: %9.2f%n",psum/mykeylist.length);
    }



    private static void setup(StringMap myStringMap){
        myStringMap.put("AK", "Alaska");
        myStringMap.put("AL", "Alabama");
        myStringMap.put("NC", "North Carolina");
        myStringMap.put("CA", "California");
        myStringMap.put("NY", "New York");
        myStringMap.put("GA", "Georgia");
        myStringMap.put("WY", "Wyoming");
        myStringMap.put("MT", "Montana");
        myStringMap.put("OR", "Oregon");
        myStringMap.put("MA", "Massachusetts");
        myStringMap.put("ME", "Maine");
        myStringMap.put("RI", "Rhode Island");
        myStringMap.put("WA", "Washington");
        myStringMap.put("IA", "Iowa");
        myStringMap.put("UT", "Utah");
        myStringMap.put("CO", "Colorado");
        myStringMap.put("IH", "Idaho");
        myStringMap.put("NM", "New Mexico");
        myStringMap.put("TX", "Texas");
        myStringMap.put("KS", "Kansas");
        myStringMap.put("TN", "Tennessee");
        myStringMap.put("AR", "Arkansas");
        myStringMap.put("IL", "Illinois");
        myStringMap.put("IN", "Indiana");
        myStringMap.put("NV", "Nevada");
        myStringMap.put("SC", "South Carolina");
        myStringMap.put("SD", "South Dakota");
        myStringMap.put("ND", "North Dakota");
        myStringMap.put("VA", "Virginia");
        myStringMap.put("WI", "Wisconsin");
        myStringMap.put("MD", "Maryland");
        myStringMap.put("DE", "Delaware");
    }


}
