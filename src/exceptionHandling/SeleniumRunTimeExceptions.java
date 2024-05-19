package exceptionHandling;

/**
 * Some of the most common runtime exceptions in Selenium:-->
 * ============================================================
 * 1. NoSuchElementException:
 * This exception is thrown when the WebDriver is unable
 * to locate an element in the web page. This could happen when the element
 * is not present in the DOM or when the locator used to find the element is incorrect.
 * +++++++++++++++++++++++++++++++++++++++++++++++++++
 * 2. ElementNotVisibleException:
 * This exception is thrown when an element is present
 * in the DOM, but is not visible on the web page.
 * This could happen when the element is hidden behind another
 * element or when the element has an opacity of 0.
 * +++++++++++++++++++++++++++++++++++++++++++++++++++
 * 3. TimeoutException:
 * This exception is thrown when the WebDriver is unable
 * to perform an action within a specific time frame. This could happen
 * when the web page is slow to load, or when the element being searched for is taking too long to appear.
 *
 * +++++++++++++++++++++++++++++++++++++++++++++++++++
 * 4. StaleElementReferenceException:
 * This exception is thrown when the element being searched for
 * is no longer attached to the DOM. This could happen when the element is deleted or
 * modified after the script has located it.
 *
 * +++++++++++++++++++++++++++++++++++++++++++++++++++
 * 5. WebDriverException:
 * This is a general exception that is thrown when the WebDriver encounters an unexpected error.
 *
 * +++++++++++++++++++++++++++++++++++++++++++++++++++
 * 6. NoSuchWindowException: This exception is thrown when the WebDriver is unable to locate the
 * window it is trying to interact with. This could happen when the window is closed or
 * when the script is trying to switch to a non-existent window.
 * +++++++++++++++++++++++++++++++++++++++++++++++++++
 * 7. ElementNotFoundException :
 * This exception is commonly encountered when the WebDriver is unable to
 * locate an element on the web page using the given locator strategy.
 */

public class SeleniumRunTimeExceptions {
}
