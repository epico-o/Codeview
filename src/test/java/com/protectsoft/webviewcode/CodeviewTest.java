package com.protectsoft.webviewcode;

import android.content.Context;
import android.webkit.WebView;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.lang.reflect.Field;
import java.util.List;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 *
 */
public class CodeviewTest  {

    Codeview codeview;

    WebView webView;

    @Mock
    Context context;


    @Before
    public void setUp() {
        initMocks(this);

        context = Mockito.mock(Context.class);
        //context = new MockContext();
        assertNotNull(context);
        codeview = new Codeview(context);
    }


    @Test
    public void with() {
        Codeview.with(context);
    }


    @Test(expected = IllegalArgumentException.class)
    public void testInto() {
        Codeview.with(context)
                .into(webView);
    }


    @Test
    public void testGetAllCodeStyles() {
        List<String> fields = Codeview.getAllCodeStyles();
        Field[] fields1 = Settings.WithStyle.class.getFields();
        assertEquals(fields.size(), fields1.length);
        for(Field f : fields1) {
               boolean expected = true;
               assertEquals(expected,fields.contains(f.getName()));
        }
    }


    @Test
    public void testGetAllLanguages() {
        List<String> fields = Codeview.getAllLanguages();
        Field[] fields1 = Settings.Lang.class.getFields();
        assertEquals(fields.size(), fields1.length);
        for(Field f : fields1) {
            boolean expected = true;
            assertEquals(expected,fields.contains(f.getName()));
        }
    }


}
