class Project6 {
    public static void main(String args[]){
        /*
        Let's continue building on projects 3 and 5. This time we will be expecting return values.
        Calls will be done like so:
        int deoxyHemoglobin = 90;
        int oxyHemoglobin = 10;
        double O2Saturation = calculateO2(int deoxyHemoglobin, int oxyHemoglobin);

        Instructions for each method are found below and the expected return type can also be found.
        Be sure to return the correct type! Also remember to keep the printlns in the method

        *********************************************************************
        There are a lot of calculations those in medicine might need to perform.
        A lot of them you may have heard of in some shape or form. Today we will
        calculate O2 saturation, BMI, BMI prime, Creatine Clearance, and the
        Sodium correction for hyperglycemia

        1. Each of these calculations must be performed according to the specifications
        below.
        2. Write each calculation in its own separate static method.
        
        The methods will be:
        calculateO2(int deoxyHemoglobin, int oxyHemoglobin) - given 2 values concentration of deoxygenated hemoglobin, and 
        concentration of oxygenated hemoglobin.
        O2Saturation = C(HbO2)/(C(HbO2) + C(Hb)) * 100%
        RETURN: double
        OUTPUT: The oxygen saturation given a deoxygenated hemoglobin concentration of
        90 and an oxygenating hemoglobin concentration of 10 is 90%

        calculateBMI(int lbs, int height) - given 2 value of weight (lbs) and height in inches, calculate BMI.
        Body mass index, kg/m2 = weight, kg / (height, m)2
        remember to convert units!!
        RETURN: double
        OUTPUT: The BMI of a 165 lb male of height 69 inches is 24.4 kg/m^2

        calculateBMIPrime(int lbs, int height) - same as above, but divide by by 25. result is unit less
        https://en.wikipedia.org/wiki/Body_mass_index#BMI_prime
        RETURN: double
        OUTPUT: The BMI Prime of a 165 lb male of height 69 inches is .976

        calculateCreatineClearance(int age, int lbs, double cc) - given 3 values of age in years, weight in lbs,
        and creatine concentration in mg/dL calculate the creatine clearance to assess 
        a patients renal function.
        Cockcroft-Gault CrCl, mL/min = (140 – age) × (weight, kg) × (0.85 if female) / (72 × Cr)
        RETURN: double
        OUTPUT: The creatine clearance rate for a 30 year old 150 pound male with a creatine
        concentration of .7 mg/dL is 148 mL/min

        calculateSodiumCorrection(int sodium, int glucose) - given 2 values of sodium (mEq/L) and Glucose
        (mg/dL) calculate the corrected sodium concentration. 
        Corrected Sodium (Hillier, 1999) = Measured sodium + 0.024 * (Serum glucose - 100)
        RETURN: double
        OUTPUT: The corrected sodium concentration in hyperglycemia for an original sodium
        concentration of 137 mEq/L and 70 mg/dL is 136 mEq/L
        https://pubmed.ncbi.nlm.nih.gov/10225241/

        calculateSodiumCorrectionString(int sodium, int glucose) - given 2 values of sodium (mEq/L) and Glucose
        (mg/dL) calculate the corrected sodium concentration. 
        Corrected Sodium (Hillier, 1999) = Measured sodium + 0.024 * (Serum glucose - 100)
        RETURN: String (the string should just be the below output)
        OUTPUT: The corrected sodium concentration in hyperglycemia for an original sodium
        concentration of 137 mEq/L and 70 mg/dL is 136 mEq/L
        https://pubmed.ncbi.nlm.nih.gov/10225241/
        */

    }
}