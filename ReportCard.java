package com.example.android.reportcard;


class ReportCard{

    private static final String GRADE_A = "A";
    private static final String GRADE_B = "B";
    private static final String GRADE_C = "C";
    private static final String GRADE_D = "D";
    private static final String GRADE_F = "F";

    private String mStudentName;
    private String mPhysicsGrade;
    private String mChemistryGrade;
    private String mMathsGrade;
    private String mEnglishGrade;

    public ReportCard(String studentName){
        mStudentName = studentName;
    }

    public ReportCard(String studentName, String physicsGrade, String chemistryGrade,
                      String mathsGrade, String englishGrade){

        mStudentName = studentName;
        mPhysicsGrade = physicsGrade;
        mChemistryGrade = chemistryGrade;
        mMathsGrade = mathsGrade;
        mEnglishGrade = englishGrade;
    }

    public String getStudentName(){
        return mStudentName;
    }

    public void setStudentName(String studentName){
        mStudentName = studentName;
    }

    public String getPhysicsGrade(){
        return mPhysicsGrade;
    }

    public void setPhysicsGrade(String physicsGrade){
        this.mPhysicsGrade = physicsGrade;
    }

    public String getChemistryGrade(){
        return mChemistryGrade;
    }

    public void setChemistryGrade(String chemistryGrade){
        mChemistryGrade = chemistryGrade;
    }

    public String getMathsGrade(){
        return mMathsGrade;
    }

    public void setMathsGrade(String mathsGrade){
        mMathsGrade = mathsGrade;
    }

    public String getEnglishGrade(){
        return mEnglishGrade;
    }

    public void setEnglishGrade(String englishGrade){
        mEnglishGrade = englishGrade;
    }

    @Override
    public String toString(){
        return "Name=" + mStudentName +
                ";\nPhysics Grade='" + mPhysicsGrade +
                ";\nChemistry Grade='" + mChemistryGrade +
                ";\nMaths Grade='" + mMathsGrade +
                ";\nEnglish Grade='" + mEnglishGrade;
    }
}
