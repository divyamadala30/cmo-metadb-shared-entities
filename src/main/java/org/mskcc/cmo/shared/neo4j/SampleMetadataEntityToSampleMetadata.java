package org.mskcc.cmo.shared.neo4j;

import java.io.Serializable;
import org.mskcc.cmo.shared.SampleMetadata;
import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

/**
 *
 * @author ochoaa
 */
@RelationshipEntity(type = "SAMPLE_METADATA")
public class SampleMetadataEntityToSampleMetadata implements Serializable {
    @Id @GeneratedValue
    private Long id;
    @StartNode
    private SampleMetadataEntity sampleMetadataEntity;
    @EndNode
    private SampleMetadata sampleMetadata;

    public SampleMetadataEntityToSampleMetadata() {}

    public SampleMetadataEntity getSampleMetadataEntity() {
        return sampleMetadataEntity;
    }

    public void setSampleMetadataEntity(SampleMetadataEntity sampleMetadataEntity) {
        this.sampleMetadataEntity = sampleMetadataEntity;
    }

    public SampleMetadata getSampleMetadata() {
        return sampleMetadata;
    }

    public void setSampleMetadata(SampleMetadata sampleMetadata) {
        this.sampleMetadata = sampleMetadata;
    }

}
