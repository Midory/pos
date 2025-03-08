package com.techdemo.pos.projection;

import com.techdemo.pos.model.referential.Company;

import java.util.UUID;

/**
 * Projection for {@link Company}
 */
public interface CompanyInfo {
    UUID getId();

    String getName();

    String getDescription();
}