module gpc (
  input gh,
  input ph,
  input gl,
  input pl,
  input cin,
  output ghl,
  output phl,
  output ch,
  output cl
);

always @*  begin
  ghl <= gh | (ph & gl);
  phl <= ph & pl;
  ch <= gl | (pl &cin);
  cl <= cin;
end
endmodule
