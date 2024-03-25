function isError(value) {
    return value instanceof Error;
  }
  
  // Example usage:
  const exampleValue = new Error('This is an example error');
  
  if (isError(exampleValue)) {
    console.log('The value is an error:', exampleValue.message);
  } else {
    console.log('The value is not an error.');
  }
  