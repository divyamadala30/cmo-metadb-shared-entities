package org.mskcc.cmo.shared.neo4j;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import org.neo4j.ogm.annotation.typeconversion.Convert;
import org.neo4j.ogm.id.UuidStrategy;
import org.neo4j.ogm.typeconversion.UuidStringConverter;

/**
 *
 * @author ochoaa
 */
@NodeEntity(label="cmo_metadb_patient_metadata")
public class PatientMetadata implements Serializable {
    @Id @GeneratedValue(strategy = UuidStrategy.class)
    @Convert(UuidStringConverter.class)
    private UUID uuid;
    private String investigatorPatientId;
    @Relationship(type="PX_TO_SP", direction=Relationship.OUTGOING)
    private List<SampleMetadataEntity> sampleMetadataList;
    @Relationship(type="PX_TO_PX", direction=Relationship.INCOMING)
    private List<Patient>  patientList;

    public PatientMetadata() {}

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getInvestigatorPatientId() {
        return investigatorPatientId;
    }

    public void setInvestigatorPatientId(String investigatorPatientId) {
        this.investigatorPatientId = investigatorPatientId;
    }

    public List<SampleMetadataEntity> getSampleMetadataList() {
        return sampleMetadataList;
    }

    public void setSampleMetadataList(List<SampleMetadataEntity> sampleMetadataList) {
        this.sampleMetadataList = sampleMetadataList;
    }

    public void linkSampleMetadata(SampleMetadataEntity sampleMetadata) {
        if (sampleMetadataList == null) {
            sampleMetadataList = new ArrayList<>();
        }
        sampleMetadataList.add(sampleMetadata);
    }

    public List<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(List<Patient> linkedPatientList) {
        this.patientList = linkedPatientList;
    }

    public void addPatient(Patient patient) {
        if (patientList == null) {
            patientList = new ArrayList<>();
        }
        patientList.add(patient);
    }

}
