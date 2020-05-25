package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave(){
        //Given
        Product product = new Product("Cactus");
        Product product1 = new Product("Table");

        Item item = new Item(new BigDecimal(100), 10, new BigDecimal(100));
        Item item1 = new Item(new BigDecimal(10), 100, new BigDecimal(10));
        product.getItems().add(item);
        product.getItems().add(item1);
        item.setProduct(product);
        item1.setProduct(product1);

        Invoice invoice = new Invoice("Number");
        invoice.getItems().add(item);
        invoice.getItems().add(item1);
        item.setInvoice(invoice);
        item1.setInvoice(invoice);

        //When
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();
        //Then
        Assert.assertNotEquals(0, invoiceId);
        //CleanUp
        invoiceDao.deleteById(invoiceId);
    }
}
