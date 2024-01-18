package com.cjc.hl.enquiry.main.service;

import com.cjc.hl.enquiry.main.model.PropertyDocument;

public interface PropDocumentService {

	PropertyDocument saveDoc(PropertyDocument pa);

    Iterable<PropertyDocument> fetchAllDocument();

	PropertyDocument fetchDocumentById(int propDocId);

    PropertyDocument fetchDocumentByCid(int cusId);
}
