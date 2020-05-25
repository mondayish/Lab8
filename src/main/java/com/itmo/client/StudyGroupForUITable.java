package com.itmo.client;

import com.itmo.app.Location;
import com.itmo.app.Person;
import com.itmo.app.StudyGroup;
import com.itmo.utils.DateTimeAdapter;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudyGroupForUITable {
    private Long id;
    private String name;
    private Long x;
    private Long y;
    private String creationDate;
    private Long studentsCount;
    private String formOfEducation;
    private String semester;
    private String adminName;
    private Long height;
    private Long weight;
    private String passportID;
    private Double xAdmin;
    private Long yAdmin;
    private String locationName;
    private String owner;

    public StudyGroupForUITable(StudyGroup studyGroup){
        Person person = studyGroup.getGroupAdmin();
        Location location = person.getLocation();
        id = studyGroup.getId();
        name = studyGroup.getName();
        x = studyGroup.getCoordinates().getX();
        y = studyGroup.getCoordinates().getY();
        creationDate = DateTimeAdapter.parseToString(studyGroup.getCreationDate());
        studentsCount = studyGroup.getStudentsCount();
        formOfEducation = studyGroup.getFormOfEducation().getEnglish();
        semester = studyGroup.getSemesterEnum().getEnglish();
        adminName = person.getName();
        height = person.getHeight();
        weight = person.getWeight();
        passportID = person.getPassportID();
        xAdmin = location.getX();
        yAdmin = location.getY();
        locationName = location.getName();
        owner = studyGroup.getOwner();
    }
}