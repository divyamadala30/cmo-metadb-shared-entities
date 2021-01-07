package org.mskcc.cmo.shared;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 *
 * @author ochoaa
 */
public class SampleManifest extends SampleMetadata {
    protected String cmoInfoIgoId;
    protected String cmoSampleName;
    protected String sampleName;
    protected String cmoSampleClass;
    protected String oncotreeCode;
    protected String collectionYear;
    protected String tubeId;
    protected String cfDNA2dBarcode;

    public SampleManifest() {
        super();
    }

    /**
     * SampleManifest constructor.
     * @param mrn
     * @param cmoPatientId
     * @param cmoSampleId
     * @param igoId
     * @param investigatorSampleId
     * @param species
     * @param sex
     * @param tumorOrNormal
     * @param sampleType
     * @param preservation
     * @param tumorType
     * @param parentTumorType
     * @param specimenType
     * @param sampleOrigin
     * @param tissueSource
     * @param tissueLocation
     * @param recipe
     * @param baitset
     * @param fastqPath
     * @param principalInvestigator
     * @param ancestorSample
     * @param doNotUse
     * @param sampleStatus
     * @param cmoInfoIgoId
     * @param cmoSampleName
     * @param sampleName
     * @param cmoSampleClass
     * @param oncotreeCode
     * @param collectionYear
     * @param tubeId
     * @param cfDNA2dBarcode
     */
    public SampleManifest(String mrn, String cmoPatientId, String cmoSampleId, String igoId,
            String investigatorSampleId, String species, String sex, String tumorOrNormal, String sampleType,
            String preservation, String tumorType, String parentTumorType, String specimenType,
            String sampleOrigin, String tissueSource, String tissueLocation, String recipe, String baitset,
            String fastqPath, String principalInvestigator, String ancestorSample, boolean doNotUse,
            String sampleStatus, String cmoInfoIgoId, String cmoSampleName, String sampleName,
            String cmoSampleClass, String oncotreeCode, String collectionYear, String tubeId,
            String cfDNA2dBarcode) {
        super(mrn,
            cmoPatientId,
            cmoSampleId,
            igoId,
            investigatorSampleId,
            species,
            sex,
            tumorOrNormal,
            sampleType,
            preservation,
            tumorType,
            parentTumorType,
            specimenType,
            sampleOrigin,
            tissueSource,
            tissueLocation,
            recipe,
            baitset,
            fastqPath,
            principalInvestigator,
            ancestorSample,
            doNotUse,
            sampleStatus);
        this.cmoInfoIgoId = cmoInfoIgoId;
        this.cmoSampleName = cmoSampleName;
        this.sampleName = sampleName;
        this.cmoSampleClass = cmoSampleClass;
        this.oncotreeCode = oncotreeCode;
        this.collectionYear = collectionYear;
        this.tubeId = tubeId;
        this.cfDNA2dBarcode = cfDNA2dBarcode;
    }

    public String getCmoInfoIgoId() {
        return cmoInfoIgoId;
    }

    public void setCmoInfoIgoId(String cmoInfoIgoId) {
        this.cmoInfoIgoId = cmoInfoIgoId;
    }

    public String getCmoSampleName() {
        return cmoSampleName;
    }

    public void setCmoSampleName(String cmoSampleName) {
        this.cmoSampleName = cmoSampleName;
    }

    public String getSampleName() {
        return sampleName;
    }

    public void setSampleName(String sampleName) {
        this.sampleName = sampleName;
    }

    public String getCmoSampleClass() {
        return cmoSampleClass;
    }

    public void setCmoSampleClass(String cmoSampleClass) {
        this.cmoSampleClass = cmoSampleClass;
    }

    public String getOncotreeCode() {
        return oncotreeCode;
    }

    public void setOncotreeCode(String oncotreeCode) {
        this.oncotreeCode = oncotreeCode;
    }

    public String getCollectionYear() {
        return collectionYear;
    }

    public void setCollectionYear(String collectionYear) {
        this.collectionYear = collectionYear;
    }

    public String getTubeId() {
        return tubeId;
    }

    public void setTubeId(String tubeId) {
        this.tubeId = tubeId;
    }

    public String getCfDNA2dBarcode() {
        return cfDNA2dBarcode;
    }

    public void setCfDNA2dBarcode(String cfDNA2dBarcode) {
        this.cfDNA2dBarcode = cfDNA2dBarcode;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
