module cla_fa (
  input a,
  input b,
  input cin,
  output s,
  output p,
  output g
);

always @* begin
  s <= a^b^cin;
  p <= a^b;
  g <= a&b;

end
endmodule
