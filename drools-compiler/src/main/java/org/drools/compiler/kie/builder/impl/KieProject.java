package org.drools.compiler.kie.builder.impl;

import org.kie.api.builder.ReleaseId;
import org.kie.api.builder.model.KieBaseModel;
import org.kie.api.builder.model.KieSessionModel;

import java.util.Set;

public interface KieProject {
    
    ReleaseId getGAV();
    
    InternalKieModule getKieModuleForKBase(String kBaseName);

    KieBaseModel getKieBaseModel(String kBaseName);

    KieBaseModel getDefaultKieBaseModel();

    KieSessionModel getKieSessionModel(String kSessionName);

    KieSessionModel getDefaultKieSession();

    KieSessionModel getDefaultStatelessKieSession();

    void init();   
    
    ClassLoader getClassLoader();

    ClassLoader getClonedClassLoader();

    ResultsImpl verify();

    long getCreationTimestamp();

    Set<String> getTransitiveIncludes(String kBaseName);
    Set<String> getTransitiveIncludes(KieBaseModel kBaseModel);
}
